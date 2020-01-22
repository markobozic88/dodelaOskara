import java.util.ArrayList;

public class Film {

    private String naziv;
    private int godina;
    private int trajanje;
    private double rejting;

    public Film(String naziv, int godina, int trajanje, Reziser reziser, Zanr zanr){
        this.setNaziv(naziv);
        this.setGodina(godina);
        this.setTrajanje(trajanje);
        this.setTrajanje(90);
    }


    public boolean dodajGlumca(Glumac g){
        return true;
    }

    public boolean dodajRezisera(Reziser r){
        return true;
    }

    public Reziser getPredstavnik(){
        return null;
    }

    public boolean dodajKritiku(Kritika k){
        return true;
    }

    public void primiOskara(){

    }

    public void izracunajRejting(){

    }

    public int compareTo(Film f){
        return 0;
    }

    public Zanr getZanr(){
        return null;
    }

    public ArrayList<ClanEkipe> getClanoviEkipe(){
        return null;
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

    public double getRejting() {
        return rejting;
    }

    public void setRejting(double rejting) {
        this.rejting = rejting;
    }
}
