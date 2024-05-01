//     - A játékban 3 csiga versenyzik 5 körön keresztül, az nyer, aki messzebb jut. Egy körben, egy csiga 0..3 egységet megy, véletlenszerűen. A csigáknak van színe: piros zöld, kék.
//            - A játék elején lehet fogadni, hogy melyik csiga nyer!
//            - A játékban minden körben 20% eséllyel kiválasztásra kerül egy csiga, aki kap csigagyorsítót! Ennek hatására abban a körben dupla lesz a sebessége!

public class Main {
    public static void main(String[] args) {

        Csiga pirosCsiga = new Csiga("piros");
        Csiga zoldCsiga = new Csiga("zold");
        Csiga kekCsiga = new Csiga("kek");

        Csiga[] versenyzok = {pirosCsiga, zoldCsiga, kekCsiga};
        Verseny verseny = new Verseny(versenyzok);
        int korokSzama = 5;

        UserInterface userInterface = new UserInterface(verseny, korokSzama);
        userInterface.start();

    }
}
