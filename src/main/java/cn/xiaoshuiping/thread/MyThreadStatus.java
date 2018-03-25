package cn.xiaoshuiping.thread;

public class MyThreadStatus {

    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        t.setName("MyThread #1");
        showMyThreadStatus(t);
        t.start();
        Thread.sleep(5);
        showMyThreadStatus(t);
        t.waiting = false;
        Thread.sleep(5);
        showMyThreadStatus(t);
        t.notice();
        Thread.sleep(5);
        showMyThreadStatus(t);
        while (t.isAlive())
            System.out.println(t.getName() + " is Alive.");
        showMyThreadStatus(t);
    }

    static void showMyThreadStatus(Thread t){
        System.out.println(t.getName() + " Alive = " + t.isAlive() + ", State = " + t.getState());
    }
}

class MyThread extends Thread {
    boolean waiting = true;
    boolean ready = false;

    MyThread(){

    }

    public void run(){

        String tName = Thread.currentThread().getName();
        System.out.println(tName + " starting.");

        while (waiting)
            System.out.println("waiting: " + waiting);

        System.out.println("waiting...");
        startWait();

        try {
            Thread.sleep(100);
        } catch (Exception ex) {
            System.out.println(tName + " interrupted.");
        }

        System.out.println(tName + " terminating.");
    }

    synchronized void startWait(){

        try {
            while (!ready) wait();
        } catch (InterruptedException exc){
            System.out.println("wait() interrupted");
        }
    }

    synchronized void notice(){
        ready = true;
        notify();
    }
}
