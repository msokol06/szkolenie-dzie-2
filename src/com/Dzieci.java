/*
package com;

public class Rodzina {
    public static void main(String[] args) {
        Dzieci dzieci = new Dzieci("Adaś");
        Dziadkowie dziadkowie = new Dziadkowie("Dionizy", "Mieszkanie", 2000);

    }
}

class Dzieci{
    String imie;

    public Dzieci(String imie) {
        this.imie = imie;
    }
}
class Rodzice extends Dzieci{
    String nieruchomosc;

    public Rodzice(String imie, String nieruchomosc) {
        super(imie);
        this.nieruchomosc = nieruchomosc;
    }
}

class Dziadkowie extends Rodzice{
    int emerytura;

    public Dziadkowie(String imie, String nieruchomosc, int emerytura) {
        super(imie, nieruchomosc);
        this.emerytura = emerytura;
    }

}
*/

package com;

class Dziadkowie {
    protected String mieszkanie;

    public Dziadkowie(String mieszkanie) {
        this.mieszkanie = mieszkanie;
    }
}

class Rodzice extends Dziadkowie {
    String dom;

    public Rodzice(String mieszkanie, String dom) {
        super(mieszkanie);
        this.dom = dom;
        super.mieszkanie = "Most";
    }
}

public class Dzieci extends Rodzice{
    int iloscZabawek;

    public Dzieci(String mieszkanie, String dom,int iloscZabawek) {
        super(mieszkanie,dom);
        this.iloscZabawek = iloscZabawek;
    }

    @Override //nadpisuje domyślną metodę 'toString'
    public String toString() {
        return "Dzieci{" +
                "mieszkanie='" + mieszkanie + '\'' +
                ", dom='" + dom + '\'' +
                ", iloscZabawek=" + iloscZabawek +
                '}';
    }
}

class RodzinaTest{

    public static void main(String[] args) {
        Dzieci dzieci = new Dzieci("ul. Zelwerowicza","ul. Warszawska",1223456765);


        System.out.println(dzieci.toString());
    }
}
