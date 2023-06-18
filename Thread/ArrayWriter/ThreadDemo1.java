public class ThreadDemo1 {
    public static void main(String[] args) {
        Hi hi=new Hi();
        Hello hello=new Hello();

        Thread t1=new Thread(hi);
        Thread t2=new Thread(hello);

        t1.start();

        // to start the new thread a little  later
        try
        {
            Thread.sleep(10);
        }
        catch (Exception e)
        {
            System.out.println("exception is "+e);
        }

        t2.start();
    }
}
