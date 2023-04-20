public class BoundedWildcard {
    static void showXY(Coords<?> ob)
    {
        System.out.println("X Y coordinates: ");
        for(int i=0;i<ob.coords.length;i++)
        {
            System.out.println(ob.coords[i].x+" "+ob.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> ob)
    {
        System.out.println("X Y Z coordinates: ");
        for(int i=0;i<ob.coords.length;i++)
        {
            System.out.println(ob.coords[i].x+" "+ob.coords[i].y+" "+ob.coords[i].z);
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> ob)
    {
        System.out.println("X Y Z t coordinates: ");
        for(int i=0;i<ob.coords.length;i++)
        {
            System.out.println(ob.coords[i].x+" "+ob.coords[i].y+" "+ob.coords[i].z+" "+ob.coords[i].t);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        TwoD[] twoDS = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23)
        };

        Coords<TwoD>twoDCoords=new Coords<TwoD>(twoDS);
        System.out.println("contents of TwoD: ");
        showXY(twoDCoords);

        FourD[] fourDS= {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17),
            };

        Coords<FourD>fourDCoords=new Coords<FourD>(fourDS);
        System.out.println("contents of FourD: ");
        showXY(fourDCoords);
        showXYZ(fourDCoords);
        showAll(fourDCoords);
    }
}
