public class SynchronizedBuffer implements Buffer{
    private int buffer=-1;
    private boolean occupied=false;

    @Override
    public synchronized void set(int value) throws InterruptedException {
        try {
            while (occupied) {
                System.out.println("producer tries to write");
                displayState("buffer is full. producer waits");
                synchronized (this){
                wait();}
            }
        }
        catch (IllegalMonitorStateException illegalMonitorStateException)
        {
            illegalMonitorStateException.printStackTrace();
        }
        buffer=value;
        occupied=true;
        displayState("producer writes.");
        synchronized (this){
        try {
            notify();
        }
        catch (IllegalMonitorStateException illegalMonitorStateException)
        {
            illegalMonitorStateException.printStackTrace();
        }
        }
    }

    @Override
    public int get() throws InterruptedException {
        try {
            while (!occupied) {
                System.out.println("consumer tries to read.");
                displayState("buffer is empty. can't read");
                synchronized (this){
                wait(); }
            }
        }
        catch (IllegalMonitorStateException illegalMonitorStateException)
        {
            illegalMonitorStateException.printStackTrace();
        }
        occupied=false;
        displayState("consumer reads "+buffer);
        synchronized (this) {
            try {
                notify();
            } catch (IllegalMonitorStateException illegalMonitorStateException) {
                illegalMonitorStateException.printStackTrace();
            }
        }
        return buffer;
    }

    public void displayState(String operation)
    {
        System.out.printf("%-40s%d\t\t%b\n\n",operation,buffer,occupied);
    }
}
