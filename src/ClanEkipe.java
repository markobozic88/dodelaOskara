import java.util.Date;

public abstract class ClanEkipe {
    private String ime;
    private String prezime;
    Date datumRodjenja;


    public ClanEkipe(String ime, String prezime, Date datumRodjenja, Pol pol){
        this.setIme(ime);
        this.setPrezime(prezime);
        this.datumRodjenja = datumRodjenja;
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

    /*public Pol getPol(){
        return
    }*/

}
