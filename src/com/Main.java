package com;

public class Main {

    public static void main(String[] args) {

        Samochod fiat = new Samochod();
 //       fiat.jedzie();
        fiat.kolor = "Czerwony";
        fiat.mocKM = 100;
        System.out.println(fiat.kolor);
        System.out.println(fiat.getMocKM());

        Samochod volvo = new Samochod();
 //       volvo.jedzie();


    }
}

class Samochod extends Pojazd{
    String kolor;
    int mocKM;

    public void jedzie(int predkosc) {
        System.out.println("Samochód jedzie z predkoscia " + predkosc);
    }

    @Override
    public void stop() {
        System.out.println("Samochód zatrzymuje się");
    }

    public int getMocKM() {
        return mocKM;
    }
}

class Rower extends Pojazd{
    @Override
    public void jedzie(int predkosc) {
        System.out.println("Rower jedzie z predkoscia " + predkosc);
    }

    @Override
    public void stop() {
        System.out.println("Rower zatrzymuje się");
    }
}

abstract class Pojazd {
    void jedzie(int predkosc){
        System.out.println("Pojazd jedzie z predkoscia " + predkosc);
    };
    abstract void stop();

}
/*

class Rower implements Pojazd{
    @Override
    public void jedzie(int predkosc) {
        System.out.println("Rower jedzie z predkoscia " + predkosc);
    }

    @Override
    public void stop() {
        System.out.println("Rower zatrzymuje się");
    }
}

interface Pojazd {
    void jedzie(int predkosc){
        System.out.println("Pojazd jedzie z predkoscia " + predkosc);
    };
    abstract void stop();

}
 */

/*

 */