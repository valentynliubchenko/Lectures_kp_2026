package ua.nure;

/**
 * Hello world!
 *
 */
public class AppSimpleThread2
{
    public static void main( String[] args )
    {
        Thread t = new Thread(() -> {
            System.out.println("Example thread started " + Thread.currentThread().getName());
        }, "My Name");
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
