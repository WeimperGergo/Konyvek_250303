package hu.szamalk.modell;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Kollekcio {
    final private ArrayList<Konyv> konyvek;

    public Kollekcio() {
        this.konyvek = new ArrayList<Konyv>();
    }

    public Kollekcio(ArrayList<Konyv> konyvek) {
        this.konyvek = konyvek;
    }

    public void beTeszKonyv (Konyv konyv) {
        if (!konyvek.contains(konyv)) konyvek.add(konyv);
    }

    public void kiVeszKonyv (Konyv konyv) {
        if (!konyvek.contains(konyv)) konyvek.remove(konyv);
    }

    public void fajlbaIrKonyvekBF() {
        try (BufferedWriter iras = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("könyvek.txt"), "UTF-8"))) {
            for (Konyv konyv : konyvek) {
                iras.write(konyv.getCim() + ";" + konyv.getSzerzok() + ";" + konyv.getKiadasEv() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
