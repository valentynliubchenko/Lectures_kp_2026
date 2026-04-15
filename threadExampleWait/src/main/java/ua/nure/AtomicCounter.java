package ua.nure;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
    private final AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();  // Атомарна операція increment і get
    }

    public int getCount() {
        return count.get();
    }
}
