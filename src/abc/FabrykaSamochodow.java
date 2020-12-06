package abc;

public class FabrykaSamochodow {
    public static Samochod createSamochod(int maxPredkosc){
        Samochod samochod;
        switch (maxPredkosc){
            case(200):
                samochod = new Mercedes(100000, 200,"Bialy");

            default: samochod = null;
        }
    return samochod;
    }
}

interface Samochod{
    int maxPredkosc();
}
class Mercedes implements Samochod{
    int cena;
    int maxPredkosc;
    String kolor;

    public Mercedes(int cena, int maxPredkosc, String kolor) {
        this.cena = cena;
        this.maxPredkosc = maxPredkosc;
        this.kolor = kolor;
    }

    @Override
    public int maxPredkosc() {
        return 150;
    }
}
class BMW implements Samochod{
    int cena;
    int maxPredkosc;
    String kolor;

    public BMW(int cena, int maxPredkosc, String kolor) {
        this.cena = cena;
        this.maxPredkosc = maxPredkosc;
        this.kolor = kolor;
    }

    @Override
    public int maxPredkosc() {
        return 250;
    }
}
