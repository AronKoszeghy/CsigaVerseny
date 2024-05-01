import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Verseny verseny;
    private int korokSzama;

    public UserInterface(Verseny verseny, int korokSzama) {
        this.verseny = verseny;
        this.korokSzama = korokSzama;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Udvozollek a csigaversenyen! Fogadj, hogy melyik csiga fog nyerni! Ird be, hogy 'piros', 'zold' vagy 'kek'!");
        String tipp = tippeles();
        futam();
        List<String> gyoztesek = kiGyozott();
        eredmenyHirdetes(gyoztesek, tipp);
    }

    private String tippeles() {
        String tipp = scanner.nextLine();
        while (!tippValidalva(tipp)) {
            System.out.println("Ilyen szinu versenyzo nincs. Ird be ujra, hogy 'piros', 'zold' vagy 'kek'!");
            tipp = scanner.nextLine();
        }
        return tipp;
    }

    private boolean tippValidalva(String tipp) {
        return tipp.equals("piros")
                || tipp.equals("zold")
                || tipp.equals("kek");
    }

    private void futam() {
        System.out.println("Kezdodik a verseny. Nyomj entert amig a verseny veget nem er!");
        int kor = 1;
        while (kor <= korokSzama) {
            scanner.nextLine();
            verseny.haladnakEgyKort();
            System.out.print(kor + ". kor:\n");
            System.out.print(verseny.allas());
            kor++;
        }
    }

    private List<String> kiGyozott() {
        List<String> gyoztesek = verseny.kiVezet();
        if (gyoztesek.size() == 1) {
            System.out.println("\nA " + gyoztesek.get(0) + " csiga gyozott!");
        } else {
            System.out.println("\nGyoztes csigak: " + gyoztesek);
        }
        return gyoztesek;
    }

    private void eredmenyHirdetes(List<String> gyoztesek, String tipp) {
        if (gyoztesek.contains(tipp)) {
            System.out.println("Jol tippeltel! :)");
        } else {
            System.out.println("Rosszul tippeltel! :(");
        }
    }
}
