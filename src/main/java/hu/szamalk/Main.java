package hu.szamalk;


import hu.szamalk.modell.Kollekcio;
import hu.szamalk.modell.Konyv;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Konyv k1 = new Konyv("Rokarudi", List.of("Wörös Sánta"), 1992);
        Konyv k2 = new Konyv("Wuck", List.of("Kupak Endre"), 1998);
        Konyv k3 = new Konyv("RudiRoca", List.of("Sörös Vándor"), 2003);
        Konyv k4 = new Konyv("Jamai Katalin", List.of("Négy Szászhúz"), 2024);
        Kollekcio konyvek = new Kollekcio();

        konyvek.beTeszKonyv(k1);
        konyvek.beTeszKonyv(k2);
        konyvek.beTeszKonyv(k3);
        konyvek.beTeszKonyv(k4);
        konyvek.kiVeszKonyv(k2);

        konyvek.fajlbaIrKonyvekBF();
    }
}