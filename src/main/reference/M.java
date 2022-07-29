package main.reference;

public class M {
    @Override
    protected void finalize(){
        System.out.println("finalize");
    }
}
