import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer{
    private final ArrayBlockingQueue<Integer>buffer;

    public BlockingBuffer()
    {
        buffer=new ArrayBlockingQueue<Integer>(1);
    }

    @Override
    public void set(int value) throws InterruptedException {
        buffer.put(value);
        System.out.println("producer writes "+value+"\t buffer cell occupied "+buffer.size());
    }

    @Override
    public int get() throws InterruptedException {
        int value= buffer.take();
        System.out.println("consumer reads "+value+"\t buffer cell occupied "+buffer.size());
        return value;
    }
}
