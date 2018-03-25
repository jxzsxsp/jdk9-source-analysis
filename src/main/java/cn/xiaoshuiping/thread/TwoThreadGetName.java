package cn.xiaoshuiping.thread;

public class TwoThreadGetName extends Thread {

    public void printMsg(){
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name = " + name);
    }

    public void run(){
        for (int i = 0; i < 5; i++){
            printMsg();
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            TwoThreadGetName tt = new TwoThreadGetName();
            tt.start();
            tt.printMsg();
        }
    }

}
