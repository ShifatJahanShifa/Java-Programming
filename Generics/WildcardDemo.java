public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] array={1,2,3,4,5};
        Stats<Integer>iobj=new Stats<Integer>(array);
        System.out.println("iobj average is: "+iobj.calculateAverage());

        Double[] array2={1.1,2.2,3.3,4.4,5.5};
        Stats<Double>dobj=new Stats<Double>(array2);
        System.out.println("dobj average is: "+dobj.calculateAverage());

        Float[] array3={1.0F,2.0F,3.0F,4.0F,5.0F};
        Stats<Float>fobj=new Stats<Float>(array3);
        System.out.println("fobj average is: "+fobj.calculateAverage());

        if(iobj.isSameAverage(dobj))
            System.out.println("iobj and dobj average are same");
        else
            System.out.println("iobj and dobj average are different");

        if(iobj.isSameAverage(fobj))
            System.out.println("iobj and fobj average are same");
        else
            System.out.println("iobj and fobj average are different");
    }
}
