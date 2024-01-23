// 2 ways to use Thrteads in Java -> Thread class (extend) , Runnable Interface (implement)

class SampleThread1 extends Thread {
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
        SampleThread1 sampleThread1 = new SampleThread1("Thread A");
        SampleThread1 sampleThread2 = new SampleThread1("Thread B");
        SampleThread1 sampleThread3 = new SampleThread1("Thread C");
        sampleThread1.start();
        sampleThread1.join(); // Wait until this thread completes it's business
        sampleThread2.start();
        sampleThread3.start();
    }
}
