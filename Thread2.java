// Runnable Interface

class MyRunnable implements Runnable{
    public void run (){
        System.out.println("Runnable Thread is running...");
    }
}

public class Thread2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}
