import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedBufferTest {
    public static void main(String[] args) {
        Buffer sharedBuffer=new BlockingBuffer();
        ExecutorService executorService= Executors.newCachedThreadPool();

        executorService.execute(new Producer(sharedBuffer));
        executorService.execute(new Consumer(sharedBuffer));
        executorService.shutdown();
    }
}
