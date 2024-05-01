public class Csiga {

    private String szin;
    private int megtettTavolsag;
    public boolean gyorsitvaVan;

    public Csiga(String szin) {
        this.szin = szin;
        this.megtettTavolsag = 0;
        this.gyorsitvaVan = false;
    }

    public String getSzin() {
        return szin;
    }

    public String toString() {
        return "Csiga{" +
                "szin='" + getSzin() + '\'' +
                ", megtettTavolsag=" + megtettTavolsag +
                '}';
    }

    public void halad(int sebesseg) {
        megtettTavolsag += sebesseg;
    }


}
