import java.util.Random;

public class PrintTask implements Runnable{
    private final int sleepTime;
    private final String taskName;
    private final static Random generator=new Random() ;

    PrintTask(String taskName)
    {
        this.taskName=taskName;
        sleepTime= generator.nextInt(5000);
    }

    @Override
    public void run() {
        try{
            System.out.printf("task : %s, sleeping time %d\n",taskName,sleepTime);
            Thread.sleep(sleepTime);
        }
        catch (InterruptedException interruptedException)
        {
            System.out.println(interruptedException+" occurred");
        }
        System.out.println(taskName+" done");
    }
}
