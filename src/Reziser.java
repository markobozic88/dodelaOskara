import java.time.LocalDate;
public class Reziser extends ClanEkipe implements Comparable<Reziser>{
    private int reziraniFilmovi;
    public Reziser(String ime, String prezime, LocalDate datumRodjenja, Pol pol, int reziraniFilmovi) {
        super(ime, prezime, datumRodjenja, pol);
        this.reziraniFilmovi = reziraniFilmovi;
    }
    @Override
    public void odrziGovor() {
        System.out.println("Govor koji reziser " + getIme() + " " + getPrezime() + " odrzi nakon primljenog oskara");
    }
    public void primiOskara() {
        this.odrziGovor();
    }
    @Override
    public int compareTo(Reziser r){
        return r.getReziraniFilmovi() - this.getReziraniFilmovi();
    }
    public int getReziraniFilmovi() {
        return reziraniFilmovi;
    }
    public void setReziraniFilmovi(int reziraniFilmovi) {
        this.reziraniFilmovi = reziraniFilmovi;
    }
    @Override
    public String toString() {
        return "\nReziser - " + super.toString() + ", Broj reziranih filmova: " + getReziraniFilmovi();
    }
}
