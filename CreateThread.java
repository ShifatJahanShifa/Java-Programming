public class CreateThread {
    public static void main(String[] args) {
        System.out.println("start");

        Thread t1=new Thread(new PrintTask("task1"));
        Thread t2=new Thread(new PrintTask("task2"));
        Thread t3=new Thread(new PrintTask("task3"));

        t1.start();
        t2.start();
        t3.start();

        System.out.println("end.");
    }
}
