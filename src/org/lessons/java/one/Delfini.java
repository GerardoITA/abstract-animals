package org.lessons.java.one;

public class Delfini extends Animali implements Nuotare{


    @Override
    public void verso() {
        System.out.println("blub");
    }

    @Override
    public void mangia() {
        System.out.println("Pesci");
    }

    @Override
    public void nuotare() {
        System.out.println("Sto nuotando");
    }
}