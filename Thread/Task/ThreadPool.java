import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        System.out.println("thread pool created");
        
        executorService.execute(new PrintTask("task1"));
        executorService.execute(new PrintTask("task2"));
        executorService.execute(new PrintTask("task3"));

        executorService.shutdown();
    }
}
