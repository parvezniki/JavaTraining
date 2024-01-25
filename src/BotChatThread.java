
/* wait() and notify() of Threads
Bot 1 : "Hi","How are you?","I'm good too"
Bot 2 : "Hello","I'm cool, How about you?","Good to know"
 */
class Chat {
    boolean myTurn = false;

    synchronized public void Ask(String str1) {
        if(myTurn) {
            try{ wait(); } catch(InterruptedException ie) {
                System.out.println("Ahh, something wrong.");
            }
        }
        System.out.println(str1); // Here is i'm talking
        myTurn = true;
        notify();
    }

    public synchronized void Reply(String str1) {
        if(!myTurn) {
            try{ wait(); } catch(InterruptedException ie) {
                System.out.println("Ahh, something wrong.");
            }
        }
        System.out.println(str1); // Here is i'm talking
        myTurn = false;
        notify();
    }
}
class Bot1 implements Runnable {
    Chat ch;
    String []s1 = {"Hi","How are you?","I'm good too"};
    public Bot1(Chat ch) {
        this.ch = ch;
    }
    public void run() {
        for(String mesg:s1) {
            this.ch.Ask(mesg);
        }
    }
}
class Bot2 implements Runnable {
    Chat ch;
    String []s2 = {"Hello","I'm cool, How about you?","Good to know"};
    public Bot2(Chat ch) {
        this.ch = ch;
    }
    public void run() {
        for(String mesg:s2) {
            // here I will be chatting
            this.ch.Reply(mesg);
        }
    }
}
public class BotChatThread {

    public static void main(String []args) throws Exception {
        Chat ch = new Chat();
        Runnable runn1 = new Bot1(ch);
        Thread t1 = new Thread(runn1);

        Runnable runn2 = new Bot2(ch);
        Thread t2 = new Thread(runn2);

        t1.start();
        t2.start();
    }
}
