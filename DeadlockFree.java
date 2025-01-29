// ReentrantLock Algorithm
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockFree
{
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread t1 = new Thread (()->{
            while (true) {
                try {
                    if (lock1.tryLock()) {
                        try {
                            if (lock2.tryLock()) {
                                try {
                                    System.out.println("Thread 1 locked both locks");
                                    break;
                                } finally {
                                    lock2.unlock();
                                }
                            }
                        } finally {
                            lock1.unlock();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread (()->{
            while (true) {
                try {
                    if (lock1.tryLock()) {
                        try {
                            if (lock2.tryLock()) {
                                try {
                                    System.out.println("Thread 2 locked both locks");
                                    break;
                                } finally {
                                    lock2.unlock();
                                }
                            }
                        } finally {
                            lock1.unlock();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}