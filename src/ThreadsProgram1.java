// 2 ways to use Thrteads in Java -> Thread class (extend) , Runnable Interface (implement)

class SampleThread1 implements Runnable {
    String nameOfThread;
    public SampleThread1(String name) {
        nameOfThread = name;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println(nameOfThread+" -> "+i);
        }
    }
}


public class ThreadsProgram1 {
    public static void main(String []args) throws Exception {
        Runnable sampleThread1 = new SampleThread1("Thread A");
        Thread t1 = new Thread(sampleThread1);
        Runnable sampleThread2 = new SampleThread1("Thread B");
        Thread t2 = new Thread(sampleThread2);
        Runnable sampleThread3 = new SampleThread1("Thread C");
        Thread t3 = new Thread(sampleThread3);
        t1.start();
        t2.start();
        t3.start();
    }
}
