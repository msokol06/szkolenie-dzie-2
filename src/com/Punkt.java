package com;

public class Punkt {
    int x;
    int y;

    Punkt(int a, int b) {
        x = a;
        y = b;
    }

    Punkt() {
    }
}

class TestPunkt {
    public static void main(String[] args) {
        Punkt punkt = new Punkt(3, 4);
        System.out.println(punkt.x + "\n" + punkt.y);
    }
}
