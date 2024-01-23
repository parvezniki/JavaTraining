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
    Counter cnt;
    public CounterThread(Counter cnt) {
        this.cnt = cnt;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            this.cnt.increaseCounter();
        }
    }
}


public class ThreadsProgram2 {
    public static void main(String []args) throws Exception {
        Counter cnt1 = new Counter();
        CounterThread ct1 = new CounterThread(cnt1);
        CounterThread ct2 = new CounterThread(cnt1);
        ct1.start();
        ct2.start();
        System.out.println(cnt1.getCounter());
    }
}
