package org.lessons.java.one;

public class Passerotto extends Animali implements Volare{


    @Override
    public void verso() {
        System.out.println("Cirp");
    }

    @Override
    public void mangia() {
        System.out.println("Pane");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando");
    }
}