public class GenericConstructor {
    private double value;

    <T extends Number> GenericConstructor(T v)
    {
        value=v.doubleValue();
    }

    public void showValue()
    {
        System.out.println("value : "+value);
    }

    public static void main(String[] args) {
        GenericConstructor ob1=new GenericConstructor(88);
        GenericConstructor ob2=new GenericConstructor(123.5F);

        ob1.showValue();
        ob2.showValue();
    }
}
