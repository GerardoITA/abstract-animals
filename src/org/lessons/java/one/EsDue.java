package org.lessons.java.one;

public class EsDue {

    void faiVolare(Volare animale) {
        animale.vola();
    }
    void faiNuotare(Nuotare animale) {
        animale.nuotare();
    }
    public static void main(String[] args) {

        Passerotto p = new Passerotto();
        Aquila a = new Aquila();
        Delfini d = new Delfini();

        Animali[] animali = new Animali[3];

        animali[0] = a;
        animali[1] = p;
        animali[2] = d;

        for ( Animali an: animali) {
            if ( an instanceof Volare) {
                ((Volare) an).vola();
            } else {
                ((Nuotare) an).nuotare();
            }
        }


    }

}
