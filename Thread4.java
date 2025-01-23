// Without SYnchronization
class Shared {
    void print(int n) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }
}

public class Thread4 {
    public static void main(String[] args) {
        Shared obj = new Shared();
        Thread t1 = new Thread(() -> obj.print(5));
        Thread t2 = new Thread(() -> obj.print(10));

        t1.start();
        t2.start();

    }
}
