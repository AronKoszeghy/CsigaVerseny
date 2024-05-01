public class Csiga {

    private String szin;
    private int megtettTavolsag;
    protected boolean gyorsitvaVan;

    public Csiga(String szin) {
        this.szin = szin;
        this.megtettTavolsag = 0;
        this.gyorsitvaVan = false;
    }

    public String getSzin() {
        return szin;
    }

    public String toString() {
        return szin + " csiga: " + megtettTavolsag;
    }

    public void halad(int sebesseg) {
        megtettTavolsag += sebesseg;
    }

    public int getMegtettTavolsag() {
        return  megtettTavolsag;
    }


}
