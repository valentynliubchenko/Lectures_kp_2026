package ua.nure;

/**
 * Hello world!
 *
 */
public class AppSimpleRunnable
{
    public static void main( String[] args ) throws InterruptedException {
        Runnable runnable = new MyRunnable();
        Thread thread0 = new Thread(runnable);
        thread0.setName("My thread 0");
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread0.start();
        thread1.start();
        thread2.start();


        System.out.println( "Exit" );
    }
}
