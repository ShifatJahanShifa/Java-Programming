import java.util.Random;

public class PrintTask implements Runnable{
    private final int sleepTime;
    private final String taskName;
    private final static Random generator=new Random();

    public PrintTask(String taskName)
    {
        this.taskName=taskName;
        sleepTime= generator.nextInt(5000);
    }

    public void run()
    {
        try{
            System.out.println("task name: "+taskName+" sleeping time: "+sleepTime);
            Thread.sleep(sleepTime);
        }
        catch (InterruptedException interruptedException)
        {
            System.out.println("terminated prematurely due to interruption");
        }

        System.out.println("done sleeping "+taskName);
    }
}
