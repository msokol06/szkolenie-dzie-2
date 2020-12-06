package com;

public class Dzialanie {

    public static void mnozenie(int a, int b) {
        System.out.println(a * b);
    }

    public static void mnozenie(int a, double b, int c) {
        System.out.println(a * b * c);
    }

    public static void mnozenie(int a, int b, int c, int d) {
        System.out.println(a * b * c * d);
    }
}
class DzialanieTest{
    public static void main(String[] args) {

        Dzialanie.mnozenie(2, 3);
        Dzialanie.mnozenie(2,6.3,7);
        Dzialanie.mnozenie(2,6,2,2);
    }
}