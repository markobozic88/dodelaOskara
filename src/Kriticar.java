import java.util.Objects;
import java.util.Random;
public class Kriticar {
    private String ime;
    private String prezime;
    private int reputacija;
    public Kriticar(String ime, String prezime, int reputacija){
        this.setIme(ime);
        this.setPrezime(prezime);
        this.setReputacija(Math.min(reputacija, 100));
    }
    public void oceniFilm(Film f){
        System.out.println(f.dodajKritiku(new Kritika(this,new Random().nextInt(10) + 1)) ? "film je ocenjen" :
                "kriticar je vec ocenjivao ovaj film");
    }
    public void pohvali(Kriticar k){
        k.setReputacija(k.getReputacija() + this.reputacija / 10);
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
        return "Kriticar - Ime: " + getIme() + ", Prezime: " + getPrezime() + ", Reputacija: " + getReputacija();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kriticar kriticar = (Kriticar) o;
        return getReputacija() == kriticar.getReputacija() &&
                getIme().equals(kriticar.getIme()) &&
                getPrezime().equals(kriticar.getPrezime());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getIme(), getPrezime(), getReputacija());
    }
}
