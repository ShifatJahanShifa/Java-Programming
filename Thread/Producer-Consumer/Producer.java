import java.util.Random;

public class Producer implements Runnable{
    private final Buffer sharedBuffer;
    private final static Random generator=new Random();

    public Producer(Buffer buffer)
    {
        sharedBuffer=buffer;
    }

    @Override
    public void run() {
        int sum=0;
        for (int count=1;count<=10;count++)
        {
            try {
                Thread.sleep(generator.nextInt(3000));
                sharedBuffer.set(count);
                sum += count;
               // System.out.printf("\t%2d\n",count);
            }
            catch (InterruptedException interruptedException)
            {
                interruptedException.printStackTrace();
            }
        }

        System.out.println("producer done producing\nterminating producer");
    }
}
