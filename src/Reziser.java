import java.util.Date;

public class Reziser extends ClanEkipe {
    int reziraniFilmovi;

    public Reziser(String ime, String prezime, Date datumRodjenja, Pol pol, int reziraniFilmovi) {
        super(ime, prezime, datumRodjenja, pol);
        this.reziraniFilmovi = reziraniFilmovi;
    }



    @Override
    public void odrziGovor() {
        System.out.println("Govor koji reziser odrzi...");
    }


    public void primiOskara() {
        this.odrziGovor();
    }

    public int compareTo(Reziser r){
        return 0;
    }

}
