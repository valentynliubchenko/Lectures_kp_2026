package ua.nure;

/**
 * Hello world!
 *
 */
public class AppSimpleRunnable2
{
    public static void main( String[] args ) throws InterruptedException {
        Runnable runnable = new MyRunnable();
        Thread thread0 = new Thread(runnable);
        thread0.setName("My thread 0");
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread0.setName("CustomThread");
        thread0.setPriority(Thread.MAX_PRIORITY); // 10
        thread0.setDaemon(true);
        thread1.setDaemon(true);
        thread2.setDaemon(true);
        System.out.println("Thread ID: " + thread1.getId());

        thread0.start();
        thread1.start();
        thread2.start();

        Thread.sleep( 20 );

//        thread0.join();
//        thread1.join();
//        thread2.join();
        System.out.println( "Exit" );
    }
}
