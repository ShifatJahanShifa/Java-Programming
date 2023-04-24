public class StackTest {
    private double[] doubles={1.1,2.2,3.3,4.4,5.5,6.6};
    private int[] ints={1,2,3,4,5,6,7,8,9,10,11};

    Stack<Double> doubleStack;
    Stack<Integer> integerStack;

    public void testStacks()
    {
        doubleStack=new Stack<Double>(5);
        integerStack=new Stack<Integer>(10);

        testPushDouble();
        testPopDouble();
        testPushInteger();
        testPopInteger();
    }

    public void testPushDouble()
    {
        try{
            System.out.println("pushing elements onto double stack");
            for(Double item:doubles)
            {
                System.out.println("element is: "+item);
                doubleStack.push(item);
            }
        }
        catch (FullStackException fullStackException)
        {
            System.err.println();
            fullStackException.printStackTrace();
        }
    }

    public void testPopDouble()
    {
        try{
            System.out.println("popping elements from double stack");
            Double poppedValues;

            while (true)
            {
                poppedValues=doubleStack.pop();
                System.out.println(poppedValues);
            }
        }
        catch (EmptyStackException emptyStackException)
        {
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }

    public void testPushInteger()
    {
        try{
            System.out.println("pushing elements onto integer stack");
            for(Integer item:ints)
            {
                System.out.println("element is: "+item);
                integerStack.push(item);
            }
        }
        catch (FullStackException fullStackException)
        {
            System.err.println();
            fullStackException.printStackTrace();
        }
    }

    public void testPopInteger()
    {
        try{
            System.out.println("popping elements from integer stack");
            Integer poppedValues;

            boolean ok=true;
            while (ok)
            {
                poppedValues=integerStack.pop();
                System.out.println(poppedValues);
            }
        }
        catch (EmptyStackException emptyStackException)
        {
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StackTest application=new StackTest();
        application.testStacks();
    }
}
