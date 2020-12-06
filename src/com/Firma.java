package com;

import java.util.ArrayList;
import java.util.List;

public class Firma {
    public static void main(String[] args) {

        Pracownik manager = new Pracownik("Jan", "Nowak", 40);

//        Pracownik inzynier = new Pracownik();
//        inzynier.imie = "Karol";
//        inzynier.nazwisko = "Nowicki";
//        inzynier.wiek = 25;

        List<Pracownik> pracownikList = new ArrayList<>();
        pracownikList.add(manager);
  //      pracownikList.add(inzynier);

        Pracownik sekretarta = new Pracownik("Anna", "Kowalska", 30);
        Pielegniarka pielegniarka = new Pielegniarka("Janina", "Biernacka", 34,160);
        pracownikList.add(pielegniarka);
        for (Pracownik pracownik : pracownikList) {
            pracownik.pobierzDane();
        }

//        Szef szef = new Szef();
//        szef.premia = 100;
//        szef.setImie("Adam");
//        szef.setNazwisko("Nowak");
//        szef.setWiek(60);
//        szef.pobierzDane();
//        System.out.println(szef.premia);



    }
}

//class Szef extends Pracownik {
//    int premia;
//}

class Pielegniarka extends Pracownik{
    int nadgodziny;

    Pielegniarka(String imie, String nazwisko, int wiek, int nadgodziny){
        super(imie,nazwisko,wiek);
        this.nadgodziny = nadgodziny;
    }
}

class Pracownik {
    String imie;
    String nazwisko;
    int wiek;

    public Pracownik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) { //szary kolor oznacza że metoda nie została użyta
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void pobierzDane() {
        System.out.println(getImie() + " " + getNazwisko() + " " + getWiek());
    }
}

