public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String>tObj=new TwoGen<Integer,String>(88,"generics");

        tObj.showType();

        int v=tObj.getOb1();
        System.out.println("value : "+v);

        String s=tObj.getOb2();
        System.out.println("value : "+s);
    }
}
