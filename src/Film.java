import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
public class Film implements Nominovan, Comparable<Film> {
    private String naziv;
    private int godina;
    private int trajanje = 90;
    private double rejting;
    private Reziser reziser;
    private Zanr zanr;
    private List<Kritika> listaKritika;
    private List<ClanEkipe> clanoviEkipe;
    public Film(String naziv, int godina, int trajanje, Reziser reziser, Zanr zanr){
        this.naziv = naziv;
        this.godina = godina;
        if (trajanje >= 0){
            this.trajanje = trajanje;
        }
        this.reziser = reziser;
        this.zanr = zanr;
        this.listaKritika = new ArrayList<>();
        this.clanoviEkipe = new ArrayList<>();
        dodajRezisera(reziser);         // pozivam dodajRezisera da bi bio u listi clanoviEkipe i povecao broj reziranih filmova
    }
    public boolean dodajGlumca(Glumac g){
        if (this.getZanr() == Zanr.ANIMIRANI || this.getZanr() == Zanr.MJUZIKL){
            if (!g.isLepGlas()){
                return false;
            }
        }
        boolean clanEkipe = getClanoviEkipe().contains(g);
        if (clanEkipe){
            return false;
        } else {
            this.getClanoviEkipe().add(g);
            return true;
        }
    }
    public boolean dodajRezisera(Reziser r){
        boolean clanEkipe = getClanoviEkipe().contains(r);
        if (clanEkipe){
            return false;
        } else {
            this.getClanoviEkipe().add(r);
            r.setReziraniFilmovi(r.getReziraniFilmovi() + 1);
            return true;
        }
    }
    public Reziser getPredstavnik(){
        Reziser predstavnik = null;
        for (ClanEkipe ce : getClanoviEkipe()) {
            if (ce instanceof Reziser) {
                if (predstavnik == null) {
                    predstavnik = (Reziser) ce;
                } else {
                    if (predstavnik.getDatumRodjenja().isAfter(ce.getDatumRodjenja())) {
                        predstavnik = (Reziser) ce;
                    }
                }
            }
        }
        return predstavnik;
    }
    public boolean dodajKritiku(Kritika k){
        boolean dodeljenaKritika = getListaKritika().contains(k);
        if (dodeljenaKritika){
            return false;
        } else {
            this.getListaKritika().add(k);
            return true;
        }
    }
    public void primiOskara(){
        getPredstavnik().primiOskara();
    }
    public void izracunajRejting(){
        double suma = 0;
        for (Kritika kr : getListaKritika()){
            suma += (kr.getKriticar().getReputacija() / 100.0) * kr.getOcena();
        }
        suma = suma / getListaKritika().size();
        DecimalFormat df = new DecimalFormat("#.##"); // zaokruzujem rejting na dve decimale
        suma = Double.valueOf(df.format(suma));
        this.rejting = suma;
    }
    @Override
    public int compareTo(Film f){
        if (this.rejting == f.rejting){
            return f.getPredstavnik().getReziraniFilmovi() - this.getPredstavnik().getReziraniFilmovi();
        } else {
            return (int) f.rejting - (int) this.rejting;
        }
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public int getGodina() {
        return godina;
    }
    public void setGodina(int godina) {
        this.godina = godina;
    }
    public int getTrajanje() {
        return trajanje;
    }
    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }
    public Reziser getReziser() {
        return reziser;
    }
    public void setReziser(Reziser reziser) {
        this.reziser = reziser;
    }
    public Zanr getZanr() {
        return zanr;
    }
    public double getRejting() {
        izracunajRejting();
        return rejting;
    }
    public List<Kritika> getListaKritika() {
        return listaKritika;
    }
    public List<ClanEkipe> getClanoviEkipe() {
        return clanoviEkipe;
    }
    @Override
    public String toString() {
        return "\nFilm - Naziv: " + getNaziv() + ", Godina: " + getGodina() + ", Trajanje: " + getTrajanje()
                + ", Rejting: " + getRejting() + getReziser();
    }
}
