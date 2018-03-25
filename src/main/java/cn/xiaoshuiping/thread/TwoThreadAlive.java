package cn.xiaoshuiping.thread;

public class TwoThreadAlive extends Thread {

    public void printMsg(){
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name = " + name);
    }

    public void run(){
        for (int i = 0; i < 10; i++){
            printMsg();
        }
    }

    public static void main(String[] args) {
        TwoThreadAlive tt = new TwoThreadAlive();
        tt.setName("Thread");
        System.out.println("before start() tt.isAlive = [" + tt.isAlive() + "]");
        tt.start();
        System.out.println("just after start() tt.isAlive = [" + tt.isAlive() + "]");
        for (int i = 0; i < 10; i++){
            tt.printMsg();
        }
        System.out.println("the end of main(), tt.isAlive = [" + tt.isAlive() + "]");
    }

}
