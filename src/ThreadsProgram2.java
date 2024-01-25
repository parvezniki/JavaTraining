class Counter {
    int counter;
    Counter() {
        counter=0;
    }
    synchronized public void increaseCounter() {
        counter++;
    }
    public int getCounter() {
        return counter;
    }
}

class CounterThread extends Thread {
    Counter cntObj;
    public CounterThread(Counter cnt) {
        cntObj = cnt;
    }
    @Override
    public void run() {
        for(int i=0;i<10000;i++) {
            cntObj.increaseCounter();
        }
    }
}
// synchronized -> you make a method "Thread safe"

public class ThreadsProgram2 {
    public static void main(String []args) throws Exception {
        Counter counterObj = new Counter();
        Thread t1 = new CounterThread(counterObj); // NEW State
        Thread t2 = new CounterThread(counterObj);

        t1.start(); // Running State -> [[[[ Thread Lifecycle ]]]]
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counterObj.getCounter());
    }
}
