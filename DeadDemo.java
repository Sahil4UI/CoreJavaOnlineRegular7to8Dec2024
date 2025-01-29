class Resource {
    void method1()
    {
        synchronized (this)
        {
            System.out.println(Thread.currentThread().getName()+" LOCKED METHOD1");
        }
    }

    void method2()
    {
        synchronized (this)
        {
            System.out.println(Thread.currentThread().getName()+" LOCKED METHOD2");
        }
    }
}

class DeadDemo{
    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        Thread t1 = new Thread (()->{
            synchronized (resource1)
            {
                System.out.println("Thread 1 locked resource1");
                try{
                    Thread.sleep(50);
                }
                catch(InterruptedException e){

                }

                synchronized(resource2)
                {
                    System.out.println("Thread 1 locked resource2");
                }
            }
        });

        Thread t2 = new Thread (()->{
            synchronized (resource2)
            {
                System.out.println("Thread 2 locked resource2");
                try{
                    Thread.sleep(50);
                }
                catch(InterruptedException e){

                }

                synchronized(resource1)
                {
                    System.out.println("Thread 2 locked resource1");
                }
            }
        });

        t1.start();
        t2.start();

        
    }
}