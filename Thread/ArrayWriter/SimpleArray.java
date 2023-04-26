import java.util.Random;

public class SimpleArray {
    private final int[] array;
    private int writeIndex=0;
    private final static Random generator=new Random();

    public SimpleArray(int size)
    {
        array=new int[size];
    }

    public synchronized void add(int value)
    {
        try{
            Thread.sleep(generator.nextInt(500));
        }
        catch(InterruptedException interruptedException)
        {
            interruptedException.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+" value "+value+" position "+writeIndex);
        array[writeIndex]=value;
        writeIndex++;
        System.out.println("next index is: "+writeIndex);
    }

    public String toString()
    {
        String arrayComment="\narray elements are\n";

        for (var item:array)
        {
            arrayComment+=item+" ";
        }
        return arrayComment;
    }
}
