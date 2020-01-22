public class Kriticar {

    private String ime;
    private String prezime;
    private int reputacija;

    public Kriticar(String ime, String prezime, int reputacija){
        this.setIme(ime);
        this.setPrezime(prezime);
        // ne dozvoljava se reputacija iznad 100
        // TODO
    }

    public void oceniFilm(Film f){

    }

    public void pohvali(Kriticar k){

    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getReputacija() {
        return reputacija;
    }

    public void setReputacija(int reputacija) {
        this.reputacija = reputacija;
    }

    @Override
    public String toString() {
        return "Kriticar{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", reputacija=" + reputacija +
                '}';
    }
}
