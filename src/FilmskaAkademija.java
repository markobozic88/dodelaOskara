import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class FilmskaAkademija {
    private static final double MIN_REJTING = 2;
    private List<Glumac> najboljaMuskaUloga;
    private List<Glumac> najboljaZenskaUloga;
    private List<Reziser> najboljiReziser;
    private List<Film> najboljiFilm;
    public FilmskaAkademija(){
        najboljaMuskaUloga = new ArrayList<>();
        najboljaZenskaUloga = new ArrayList<>();
        najboljiReziser = new ArrayList<>();
        najboljiFilm = new ArrayList<>();
    }
    public boolean nominuj(Nominovan nominovan){
        if (nominovan instanceof Glumac){
            if(((Glumac) nominovan).getPol() == Pol.MUSKI){
                if (!this.najboljaMuskaUloga.contains(nominovan)){
                    this.najboljaMuskaUloga.add((Glumac) nominovan);
                    return true;
                }
            } else {
                if (!this.najboljaZenskaUloga.contains(nominovan)){
                    this.najboljaZenskaUloga.add((Glumac) nominovan);
                    return true;
                }
            }
        } else if (nominovan instanceof Reziser){
            if (!this.najboljiReziser.contains(nominovan)){
                this.najboljiReziser.add((Reziser) nominovan);
                return true;
            }
        } else {
            if (!this.najboljiFilm.contains(nominovan)){
                boolean imaMuski = false;
                boolean imaZenski = false;
                for (ClanEkipe ce : ((Film)nominovan).getClanoviEkipe()) {
                    if (ce.getPol() == Pol.MUSKI) {
                        imaMuski = true;
                    } else if (ce.getPol() == Pol.ZENSKI) {
                        imaZenski = true;
                    }
                }
                if (imaMuski && imaZenski){
                    if (((Film) nominovan).getRejting() >= MIN_REJTING){
                        if (((Film) nominovan).getTrajanje() >= 40){
                            this.najboljiFilm.add((Film) nominovan);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public String getNominacijeIzvestaj(){
        StringBuilder sb = new StringBuilder("\nIZVESTAJ NOMINACIJA\n");
        if (!this.najboljaMuskaUloga.isEmpty()){
            sb.append("\nNominovani za musku ulogu su:\n");
            for (Glumac glm : this.najboljaMuskaUloga){
                sb.append(glm.toString()).append("\n");
            }
        }
        if (!this.najboljaZenskaUloga.isEmpty()){
            sb.append("\nNominovani za zensku ulogu su:\n");
            for (Glumac glz : this.najboljaZenskaUloga){
                sb.append(glz.toString()).append("\n");
            }
        }
        if (!this.najboljiReziser.isEmpty()){
            sb.append("\nNominovani za rezisera su:\n");
            Collections.sort(najboljiReziser);
            for (Reziser rez : this.najboljiReziser){
                sb.append(rez.toString()).append("\n");
            }
        }
        if (!this.najboljiFilm.isEmpty()){
            sb.append("\nNominovanije za najbolji film su:\n");
            Collections.sort(najboljiFilm);
            for (Film film : this.najboljiFilm){
                sb.append(film.toString()).append("\n");
            }
        }
        return sb.toString();
    }
    public void objaviNominacije(){
        PrintWriter writer;
        String nominacije = getNominacijeIzvestaj();
        try {
            writer = new PrintWriter("nominacije.txt", "UTF-8");
            writer.print(nominacije);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void ispisiStatistikuFilmova(){
        Zanr[] zanr = Zanr.values();
        int[] brojZanrova = new int[zanr.length];
        for (Film f : this.najboljiFilm){
            for (int i = 0; i < zanr.length; i++){
                if (f.getZanr() == zanr[i]){
                    brojZanrova[i]++;
                }
            }
        }
        for (int i = 0; i < zanr.length; i++){
            System.out.println(zanr[i] + " - " + brojZanrova[i] + " nominovanih filmova");
        }
    }
    public void odrziDodelu(){
        Random random = new Random();
        if (this.najboljaMuskaUloga != null){
            Glumac oskarMuski = this.najboljaMuskaUloga.get(random.nextInt(najboljaMuskaUloga.size()));
            oskarMuski.primiOskara();
        }
        if (this.najboljaZenskaUloga != null){
            Glumac oskarZenski = this.najboljaZenskaUloga.get(random.nextInt(najboljaZenskaUloga.size()));
            oskarZenski.primiOskara();
        }
        if (this.najboljiReziser != null){
            Reziser oskarReziser = this.najboljiReziser.get(random.nextInt(najboljiReziser.size()));
            oskarReziser.primiOskara();
        }
        if (this.najboljiFilm != null){
            Film oskarFilm = this.najboljiFilm.get(random.nextInt(najboljiFilm.size()));
            oskarFilm.primiOskara();
        }
    }
}