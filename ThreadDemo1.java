public class ThreadDemo1 {
    public static void main(String[] args) {
        Hi hi=new Hi();
        Hello hello=new Hello();

        hi.start();

        // to start the new thread a little  later 
        try
        {
            Thread.sleep(10);
        }
        catch (Exception e)
        {
            System.out.println("exception is "+e);
        }
        hello.start();
    }
}
