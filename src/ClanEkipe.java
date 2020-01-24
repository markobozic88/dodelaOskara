import java.time.LocalDate;
import java.util.Objects;
public abstract class ClanEkipe implements Nominovan {
    private String ime;
    private String prezime;
    private LocalDate datumRodjenja;
    private Pol pol;
    public ClanEkipe(String ime, String prezime, LocalDate datumRodjenja, Pol pol){
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.pol = pol;
    }
    public abstract void odrziGovor();
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
    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }
    public void setDatumRodjenja(LocalDate datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }
    public Pol getPol() {
        return pol;
    }
    public void setPol(Pol pol) {
        this.pol = pol;
    }
    @Override
    public String toString() {
        return "Ime: " + getIme() + ", Prezime: " + getPrezime() +
                ", Datum rodjenja: " + getDatumRodjenja() + ", Pol: " + getPol();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClanEkipe clanEkipe = (ClanEkipe) o;
        return getIme().equals(clanEkipe.getIme()) &&
                getPrezime().equals(clanEkipe.getPrezime()) &&
                getDatumRodjenja().equals(clanEkipe.getDatumRodjenja());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getIme(), getPrezime(), getDatumRodjenja());
    }
}
