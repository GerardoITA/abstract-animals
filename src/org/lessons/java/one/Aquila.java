package org.lessons.java.one;

public class Aquila extends Animali implements Volare{


    @Override
    public void verso() {
        System.out.println("AAAAAAAAAAAAA");
    }

    @Override
    public void mangia() {
        System.out.println("Animali di medie e piccole dimensioni");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando");
    }
}