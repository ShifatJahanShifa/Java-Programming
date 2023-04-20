public class genericMethodDemo {
    // declaring a generic method
    static <T extends Comparable<T>,V extends T> boolean isIn(T x,V[] y)
    {
        for(var item:y)
        {
            if(x.equals(item)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] integers={1,2,3,4,5};

        if(isIn(2,integers) )
            System.out.println("2 is in the array");
        else
            System.out.println("2 is not in the array");

        if(isIn(7,integers) )
            System.out.println("7 is in the array");
        else
            System.out.println("7 is not in the array");


        String[] strings={"one","two","three","four","five"};

        if(isIn("two"
                ,strings) )
            System.out.println("two is in the array");
        else
            System.out.println("two is not in the array");

        if(isIn("seven",strings) )
            System.out.println("seven is in the array");
        else
            System.out.println("seven is not in the array");

    }
}
