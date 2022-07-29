package main.cglb.reference;

public class M {
    @Override
    protected void finalize(){
        System.out.println("finalize");
    }
}
