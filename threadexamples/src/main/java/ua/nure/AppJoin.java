package ua.nure;

public class AppJoin {
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread t1 = new Thread(r, "Thread1");
        Thread t2 = new Thread(r, "Thread2");
        Thread t3 = new Thread(r, "Thread3");
        t3.start();
        t2.start();
        t1.start();
        //try {
            System.out.println("Waiting for threads to complete...");
         //   t1.join();
            System.out.println("Thread1 completed");
           // t2.join();
            System.out.println("Thread2 completed");
         //   t3.join();
            System.out.println("Thread3 completed");
//        } catch (InterruptedException e) {
//            System.out.println("Thread was interrupted");
//        }
        System.out.println("All threads have completed. Main thread continues...");
        System.out.println("exit");
    }
}
