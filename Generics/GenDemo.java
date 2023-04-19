public class GenDemo {
    public static void main(String[] args) {
        // for int
        Gen<Integer>iob=new Gen<Integer>(88);
        iob.showType();
        int v= iob.getOb();
        System.out.println("value: "+v);
        System.out.println();

        // for string
        Gen<String>sob=new Gen<String>("Generics test");
        sob.showType();
        String s= sob.getOb();
        System.out.println("value: "+s);
    }
}
