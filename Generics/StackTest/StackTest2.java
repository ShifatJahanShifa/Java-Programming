public class StackTest {
    private Double[] doubles={1.1,2.2,3.3,4.4,5.5,6.6};
    private Integer[] ints={1,2,3,4,5,6,7,8,9,10,11};

    private Stack<Double> doubleStack;
    private Stack<Integer> integerStack;

    public void testStacks()
    {
        doubleStack=new Stack<Double>(5);
        integerStack=new Stack<Integer>(10);

        testPush("doubleStack",doubleStack,doubles);
        testPop("doubleStack",doubleStack);
        testPush("integerStack",integerStack,ints);
        testPop("integerStack",integerStack);
    }

    public <T> void testPush(String name,Stack<T> stack,T[] values)
    {
        try{
            System.out.println("pushing elements onto "+name);
            for(T item:values)
            {
                System.out.println("element is: "+item);
                stack.push(item);
            }
        }
        catch (FullStackException fullStackException)
        {
            System.err.println();
            fullStackException.printStackTrace();
        }
    }

    public <T> void testPop(String name,Stack<T>stack)
    {
        try{
            System.out.println("popping elements from "+name);
            T poppedValues;

            while (true)
            {
                poppedValues=stack.pop();
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
