package main.cglb.reference;

import java.io.IOException;

public class T01_NormalReference {
    //强引用
    public static void main(String[] args) throws IOException {
        M m=new M();
        m=null;
        System.gc();
        System.in.read();
    }
}
