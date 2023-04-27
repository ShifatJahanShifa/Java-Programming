import java.util.Random;

public class Consumer implements Runnable{
    private final Buffer sharedBuffer;
    private final static Random generator=new Random();

    public Consumer(Buffer buffer)
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
                sum+=sharedBuffer.get();
               // System.out.printf("\t\t\t%2d\n",sum);
            }
            catch (InterruptedException interruptedException)
            {
                interruptedException.printStackTrace();
            }
        }
        System.out.printf("\n%s %2d %s\n","consumer consumes total",sum,"terminating consumer");
    }
}
