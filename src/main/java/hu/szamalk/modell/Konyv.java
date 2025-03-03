package hu.szamalk.modell;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.UUID;


public class Konyv implements Serializable {
    private String cim;
    private List<String> szerzok;
    private int kiadasEv;
    private transient UUID id;

    public Konyv(String cim, List<String> szerzok, int kiadasEv) {
        this.cim = cim;
        this.kiadasEv = kiadasEv;
        this.szerzok = szerzok;
        ujIdGeneralas();
    }

    public void ujIdGeneralas() {
        this.id = UUID.randomUUID();
    }

    public Konyv beOlvas(){
        try {
            ObjectInputStream beOlvas = new ObjectInputStream(new FileInputStream("könyv.txt"));
            return (Konyv) beOlvas.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void fajlbaIr(Konyv konyv){
        try {
            ObjectOutputStream iras = new ObjectOutputStream(new FileOutputStream("könyv.txt"));
            iras.writeObject(konyv);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void fajlbaIrBF(Konyv konyv) {
        try (BufferedWriter iras = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("könyv.txt"), "UTF-8"))) {
            iras.write(konyv.getCim() + ";" + konyv.getSzerzok() + ";" + konyv.getKiadasEv());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) throws NemLetezoKonyvException {
        if (cim.length() < 6) {
            throw new NemLetezoKonyvException();
        } else {
            this.cim = cim;
        }
    }

    public List<String> getSzerzok() {
        return szerzok;
    }

    public int getKiadasEv() {
        return kiadasEv;
    }

    public void setKiadasEv(int kiadasEv) {
        this.kiadasEv = kiadasEv;
    }
}
