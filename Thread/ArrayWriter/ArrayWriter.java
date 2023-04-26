public class ArrayWriter implements Runnable{
    private final SimpleArray sharedArray;
    private int startValue;

    public ArrayWriter(int startValue,SimpleArray array)
    {
        this.startValue=startValue;
        sharedArray=array;
    }

    @Override
    public void run() {
        for (int i=startValue;i<startValue+3;i++)
        {
            sharedArray.add(i);
        }
    }
}
