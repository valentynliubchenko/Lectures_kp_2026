package ua.nure;

/**
 * Hello world!
 *
 */
public class AppSimpleThread
{
    public static void main( String[] args )
    {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Головний потік: " + i +" " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
