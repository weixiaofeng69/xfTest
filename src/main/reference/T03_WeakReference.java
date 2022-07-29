package main.reference;

import java.lang.ref.WeakReference;

public class T03_WeakReference {
    public static void main(String[] args) {
        WeakReference<M> weakReference=new WeakReference<>(new M()) ;
        System.out.println(weakReference.get());
        System.gc();
        System.out.println(weakReference.get());

        ThreadLocal t1=new ThreadLocal();
        t1.set(new M());
        t1.remove();
    }
}
