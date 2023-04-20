public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] array={1,2,3,4,5};
        Stats<Integer>obj=new Stats<Integer>(array);
        System.out.println("average is: "+obj.calculateAverage());

        Double[] array2={1.1,2.2,3.3,4.4,5.5};
        Stats<Double>obj2=new Stats<Double>(array2);
        System.out.println("average is: "+obj2.calculateAverage());
    }
}
