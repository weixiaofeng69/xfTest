package main.reference;

import java.lang.ref.SoftReference;

public class T02_SoftReference {
    public static void main(String[] args) throws InterruptedException {
        //软引用主要用在缓存
        SoftReference<byte[]> m=new SoftReference<>(new byte[1024*1024*10]);
        System.out.println(m.get());
        System.gc();
        Thread.sleep(500);
        System.out.println(m.get());
        byte[] b=new byte[1024*1024*15];
        System.out.println(m.get());
    }
}
