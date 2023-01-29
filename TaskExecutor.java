import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {
    public static void main(String[] args) {

        System.out.println("task creation");

        PrintTask printTask1=new PrintTask("task1");
        PrintTask printTask2=new PrintTask("task2");
        PrintTask printTask3=new PrintTask("task3");

        System.out.println("thread pool creation");

        ExecutorService executorService = Executors.newCachedThreadPool();

        System.out.println("starts execution");

        executorService.execute(printTask1);
        executorService.execute(printTask2);
        executorService.execute(printTask3);

        executorService.shutdown();
    }
}
