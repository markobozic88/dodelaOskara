import java.util.Date;
import java.util.Random;

public class Glumac extends ClanEkipe {

    private boolean lepGlas;
    Random random = new Random();

    public Glumac(String ime, String prezime, Date datumRodjenja, Pol pol) {
        super(ime, prezime, datumRodjenja, pol);
        this.lepGlas = random.nextBoolean();
    }

    @Override
    public void odrziGovor() {
        System.out.println("Govor koji glumac odrzi nakon primljenog oskara...");
    }

    public void primiOskara() {

    }


    public boolean isLepGlas(){


        return true;
    }

    @Override
    public String toString() {
        return "Glumac{" +
                "lepGlas=" + lepGlas +
                ", random=" + random +
                ", datumRodjenja=" + datumRodjenja +
                '}';
    }
}
