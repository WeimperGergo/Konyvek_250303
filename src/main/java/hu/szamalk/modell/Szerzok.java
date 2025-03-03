package hu.szamalk.modell;

import java.util.ArrayList;

public class Szerzok {
    private ArrayList<String> szerzokLista;

    public Szerzok() {
        this.szerzokLista = new ArrayList<String>();
    }

    public Szerzok(ArrayList<String> szerzokLista) {
        this.szerzokLista = szerzokLista;
    }

    public void hozzaAd(String szemely) {
        szerzokLista.add(szemely);
    }

    public ArrayList<String> getSzerzokLista() {
        return new ArrayList<>(szerzokLista);
    }
}
