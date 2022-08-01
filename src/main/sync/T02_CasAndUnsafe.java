package main.sync;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

public class T02_CasAndUnsafe {
    private static int m = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[100];
        CountDownLatch latch = new CountDownLatch(threads.length);
        ReentrantLock reentrantLock = new ReentrantLock();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                reentrantLock.lock();
                for (int j = 0; j < 10000; j++) {
                    m++;
                }
                reentrantLock.unlock();
                latch.countDown();

            });
        }
        Arrays.stream(threads).forEach((t) -> t.start());
        latch.await();
        System.out.println(m);
    }
}
