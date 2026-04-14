package ua.nure;

class Counter {
    private int count = 0;
    private final Object lock = new Object();


    public void increment() {
        System.out.println("Incrementing counter");
        synchronized (lock) {
            count++;  // Неатомарна операція
        }
    }

    public int getCount() {
        System.out.println("getCount counter");
        synchronized (lock) {
            return count;
        }
    }


    // весь метод  синхронізований
//    public synchronized void increment() {
//        count++;  // Неатомарна операція
//    }
//
//    public synchronized int getCount() {
//        return count;
//    }

    // не синхронізовані
//    public void increment() {
//        count++;  // Неатомарна операція
//    }
//
//    public int getCount() {
//        return count;
//    }

}