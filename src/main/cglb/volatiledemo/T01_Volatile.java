package main.cglb.volatiledemo;

import java.util.concurrent.TimeUnit;

public class T01_Volatile {
     volatile boolean running=true;
    void m(){
        System.out.println("m  start");
        while (running){}
        System.out.println("m end");
    }

    public static void main(String[] args) throws InterruptedException {
        T01_Volatile t1=new T01_Volatile();
        new Thread(t1::m,"t1").start();
        TimeUnit.SECONDS.sleep(1);
        t1.running=false;
    }
}
