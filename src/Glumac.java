import java.time.LocalDate;
import java.util.Random;
public class Glumac extends ClanEkipe {
    private boolean lepGlas;
    Random random = new Random();
    public Glumac(String ime, String prezime, LocalDate datumRodjenja, Pol pol) {
        super(ime, prezime, datumRodjenja, pol);
        this.lepGlas = random.nextBoolean();
    }
    @Override
    public void odrziGovor() {
        System.out.println("Govor koji glumac " + getIme() + " " + getPrezime() + " odrzi nakon primljenog oskara");
    }
    public void primiOskara() {
        if(random.nextDouble() <= 0.1){
            System.out.println("Glumac " + getIme() + " " + getPrezime() + " odbija da primi oskara");
        } else {
            this.odrziGovor();
        }
    }
    public boolean isLepGlas() {
        return lepGlas;
    }
    public void setLepGlas(boolean lepGlas) {
        this.lepGlas = lepGlas;
    }
    @Override
    public String toString() {
        return "Glumac:\n" + super.toString() + "Ima lep glas: " + isLepGlas();
    }
}
