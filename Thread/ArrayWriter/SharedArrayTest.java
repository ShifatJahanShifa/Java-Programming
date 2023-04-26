import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
    public static void main(String[] args) {
        SimpleArray sharedArray=new SimpleArray(6);

        ArrayWriter arrayWriter1=new ArrayWriter(1,sharedArray);
        ArrayWriter arrayWriter2=new ArrayWriter(11,sharedArray);

        ExecutorService executor= Executors.newCachedThreadPool();
        executor.execute(arrayWriter1);
        executor.execute(arrayWriter2);

        executor.shutdown();

        try {
            boolean status = executor.awaitTermination(1, TimeUnit.MINUTES);

            if(status)
            {
                System.out.println(sharedArray);
            }
            else
            {
                System.out.println("terminated before completion of tasks");
            }
        }
        catch (InterruptedException interruptedException)
        {
            interruptedException.printStackTrace();
        }
    }
}
