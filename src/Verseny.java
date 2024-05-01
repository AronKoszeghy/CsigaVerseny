import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Verseny {

    private Csiga[] versenyzok;
    private static Random random = new Random();

    public Verseny(Csiga[] versenyzok) {
        this.versenyzok = versenyzok;
    }

    public void haladnakEgyKort() {
        csigaGyorsitas();
        for (Csiga csiga : versenyzok) {
            int sebesseg = random.nextInt(4);
            if (csiga.gyorsitvaVan) {
                sebesseg *= 2;
                csiga.gyorsitvaVan = false;
            }
            csiga.halad(sebesseg);
        }
    }

    public void csigaGyorsitas() {
        if (random.nextInt(5) == 0) {
            Csiga gyorsitandoCsiga = versenyzok[random.nextInt(versenyzok.length)];
            gyorsitandoCsiga.gyorsitvaVan = true;
        }
    }

    public String allas() {
        StringBuilder allas = new StringBuilder();
        for (Csiga csiga : versenyzok) {
            allas.append(csiga + "\n");
        }
        return allas.toString();
    }

    public List<String> kiVezet() {
        List<String> kiVezet = new ArrayList<>();
        int maxTavolsag = -1;
        for (Csiga csiga : versenyzok) {
            int tavolsag = csiga.getMegtettTavolsag();
            if (tavolsag == maxTavolsag) {
                kiVezet.add(csiga.getSzin());
            }
            if (tavolsag > maxTavolsag) {
                maxTavolsag = tavolsag;
                kiVezet.clear();
                kiVezet.add(csiga.getSzin());
            }
        }
        return kiVezet;
    }


}
