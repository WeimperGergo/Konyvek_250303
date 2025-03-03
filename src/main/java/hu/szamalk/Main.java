package hu.szamalk;


import hu.szamalk.modell.Kollekcio;
import hu.szamalk.modell.Konyv;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Konyv k1 = new Konyv("Rokarudi", "Wörös Sánta", 1992);
        Konyv k2 = new Konyv("Wuck", "Kupak Endre", 1998);
        Konyv k3 = new Konyv("RudiRoca", "Sörös Vándor", 2003);
        Konyv k4 = new Konyv("Jamai Katalin", "Négy Szászhúz", 2024);
        Kollekcio konyvek = new Kollekcio();

        konyvek.beTeszKonyv(k1);
        konyvek.beTeszKonyv(k2);
        konyvek.beTeszKonyv(k3);
        konyvek.beTeszKonyv(k4);
        konyvek.kiVeszKonyv(k2);

        konyvek.fajlbaIrKonyvekBF();
    }
}