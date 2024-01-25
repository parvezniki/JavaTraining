class CounterClass {
    int count;
    public void increase() {
        count++;
    }
}

public class ThreadSyncProg1 {
    public static void main(String []args) throws Exception {
        CounterClass c = new CounterClass();
        Thread t1 = new Thread(new Runnable() {
           public void run() {
               for(int i=01;i<=10000;i++) {
                   c.increase();
               }
           }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for(int i=01;i<=10000;i++) {
                    c.increase();
                }
            }
        });
        t1.start();
        t2.start();
        //t1.join();
        System.out.println(c.count);
    }
}
