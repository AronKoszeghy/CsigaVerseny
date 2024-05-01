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

        System.out.println("Kezdodik a verseny. Nyomj entert amig a verseny veget nem er!");
        kovetkezoKor();
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
        return !(tipp.equals("piros")
                || tipp.equals("zold")
                || tipp.equals("kek"));
    }

    private void kovetkezoKor() {
        int kor = 0;
        while (kor <= korokSzama) {
            scanner.nextLine();
            verseny.haladnakEgyKort();
            System.out.println(kor + ". allasa:\n");
            kor++;
        }
    }
}
