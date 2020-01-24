import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestDodelaOskara {
    public static void main(String[] args) {

    Glumac g1 = new Glumac("Nebojsa", "Glogovac", LocalDate.of(1969, 8, 30), Pol.MUSKI);
    Glumac g2 = new Glumac("Vesna", "Trivalic", LocalDate.of(1965, 3, 13), Pol.ZENSKI);
    Glumac g3 = new Glumac("Nikola", "Kojo", LocalDate.of(1967, 9, 5), Pol.MUSKI);
    Glumac g4 = new Glumac("Petar", "Bozovic", LocalDate.of(1946, 5, 22), Pol.MUSKI);
    Glumac g5 = new Glumac("Neda", "Arneric", LocalDate.of(1953, 7, 15), Pol.ZENSKI);

    Reziser r1 = new Reziser("Emir", "Kusturica", LocalDate.of(1954, 11, 24), Pol.MUSKI, 24);
    Reziser r2 = new Reziser("Branka", "Bešević-Gajić", LocalDate.of(1982, 9, 18), Pol.ZENSKI, 11);
    Reziser r3 = new Reziser("Ognjenka", "Milićević", LocalDate.of(1927, 12, 26), Pol.ZENSKI, 6);
    Reziser r4 = new Reziser("Srdjan", "Dragojevic", LocalDate.of(1963, 1, 1), Pol.MUSKI, 14);
    Reziser r5 = new Reziser("Soja", "Jovanović", LocalDate.of(1922, 2, 1), Pol.ZENSKI, 28);

        // reziseri u opadajucem redosledu po broju reziranih filmova
        ArrayList<Reziser> listaRezisera = new ArrayList<>();
        listaRezisera.add(r1);
        listaRezisera.add(r2);
        listaRezisera.add(r3);
        listaRezisera.add(r4);
        listaRezisera.add(r5);
        Collections.sort(listaRezisera);
        System.out.println(listaRezisera);

    Film film1 = new Film("Crna macka, beli macor", 1998, 127, r1, Zanr.VESTERN);
    Film film2 = new Film("Maradona", 2008, 90, r1, Zanr.DOKUMENTARNI);
    Film film3 = new Film("Otac na sluzbenom putu", 1985, 136, r1, Zanr.DRAMA);
    Film film4 = new Film("Nasih 30", 2018, 63, r2, Zanr.MJUZIKL);
    Film film5 = new Film("Sveta Kumanica", 2016, 100, r2, Zanr.BIOGRAFSKI);
    Film film6 = new Film("Sveti Mardarije vladika bez adrese", 2019, 95, r2, Zanr.BIOGRAFSKI);
    Film film7 = new Film("Tudje glave", 1968, 61, r3, Zanr.HOROR);
    Film film8 = new Film("Amfitrion 38", 1972, 75, r3, Zanr.KOMEDIJA);
    Film film9 = new Film("Oh, divljino", 1967, 91, r3, Zanr.TRILER);
    Film film10 = new Film("Mi nismo andjeli", 1992, 98, r4, Zanr.SCIFI);
    Film film11 = new Film("Atomski zdesna", 2014, 94, r4, Zanr.DRAMA);
    Film film12 = new Film("Lepa sela lepo gore", 1996, 115, r4, Zanr.KOMEDIJA);
    Film film13 = new Film("Ranjeni orao", 1977, 82, r5, Zanr.AVANTURA);
    Film film14 = new Film("Kod zelenog papagaja", 1969, 75, r5, Zanr.AKCIJA);

    film1.dodajGlumca(g1);film1.dodajGlumca(g2);film1.dodajGlumca(g3);film1.dodajRezisera(r2);
    film2.dodajGlumca(g4);film2.dodajGlumca(g5);film2.dodajGlumca(g2);
    film3.dodajGlumca(g1);film3.dodajGlumca(g3);film3.dodajGlumca(g4);
    film4.dodajGlumca(g3);film4.dodajGlumca(g1);film4.dodajGlumca(g5);film4.dodajRezisera(r5);
    film5.dodajGlumca(g5);film5.dodajGlumca(g2);film5.dodajGlumca(g3);
    film6.dodajGlumca(g2);film6.dodajGlumca(g5);film6.dodajGlumca(g1);
    film7.dodajGlumca(g3);film7.dodajGlumca(g5);film7.dodajGlumca(g2);
    film8.dodajGlumca(g4);film8.dodajGlumca(g5);film8.dodajGlumca(g1);film8.dodajRezisera(r2);
    film9.dodajGlumca(g2);film9.dodajGlumca(g3);film9.dodajGlumca(g4);
    film10.dodajGlumca(g4);film10.dodajGlumca(g2);film10.dodajGlumca(g1);
    film11.dodajGlumca(g5);film11.dodajGlumca(g1);film11.dodajGlumca(g2);film11.dodajRezisera(r4);
    film12.dodajGlumca(g4);film12.dodajGlumca(g3);film12.dodajGlumca(g1);
    film13.dodajGlumca(g5);film13.dodajGlumca(g2);film13.dodajGlumca(g3);film13.dodajRezisera(r2);
    film14.dodajGlumca(g1);film14.dodajGlumca(g2);film14.dodajGlumca(g5);

        Kriticar k1 = new Kriticar("kriticar1", "kriticar1", 56);
        Kriticar k2 = new Kriticar("kriticar2", "kriticar2", 84);
        Kriticar k3 = new Kriticar("kriticar3", "kriticar3", 95);
        Kriticar k4 = new Kriticar("kriticar4", "kriticar4", 44);
        Kriticar k5 = new Kriticar("kriticar5", "kriticar54", 80);
        Kriticar k6 = new Kriticar("kriticar6", "kriticar64", 50);
        Kriticar k7 = new Kriticar("kriticar7", "kriticar7", 20);

        Kritika kr1 = new Kritika(k1, 2);
        Kritika kr2 = new Kritika(k2, 3);
        Kritika kr3 = new Kritika(k3, 2);
        Kritika kr4 = new Kritika(k4, 3);
        Kritika kr5 = new Kritika(k5, 8);
        Kritika kr6 = new Kritika(k6, 9);
        Kritika kr7 = new Kritika(k7, 3);

        film1.dodajKritiku(kr1);film1.dodajKritiku(kr2);film1.dodajKritiku(kr3);film1.izracunajRejting();
        film2.dodajKritiku(kr2);film2.dodajKritiku(kr3);film2.dodajKritiku(kr6);film2.izracunajRejting();
        film3.dodajKritiku(kr3);film3.dodajKritiku(kr1);film3.dodajKritiku(kr7);film3.izracunajRejting();
        film4.dodajKritiku(kr4);film4.dodajKritiku(kr7);film4.dodajKritiku(kr1);film4.izracunajRejting();
        film5.dodajKritiku(kr5);film5.dodajKritiku(kr3);film5.dodajKritiku(kr6);film5.izracunajRejting();
        film6.dodajKritiku(kr1);film6.dodajKritiku(kr4);film6.dodajKritiku(kr6);film6.izracunajRejting();
        film7.dodajKritiku(kr7);film7.dodajKritiku(kr4);film7.dodajKritiku(kr7);film7.izracunajRejting();
        film8.dodajKritiku(kr2);film8.dodajKritiku(kr3);film8.dodajKritiku(kr5);film8.izracunajRejting();
        film9.dodajKritiku(kr3);film9.dodajKritiku(kr5);film9.dodajKritiku(kr6);film9.izracunajRejting();
        film10.dodajKritiku(kr5);film10.dodajKritiku(kr2);film10.dodajKritiku(kr4);film10.izracunajRejting();
        film11.dodajKritiku(kr6);film11.dodajKritiku(kr4);film11.dodajKritiku(kr1);film11.izracunajRejting();
        film12.dodajKritiku(kr1);film12.dodajKritiku(kr3);film12.dodajKritiku(kr6);film12.izracunajRejting();
        film13.dodajKritiku(kr2);film13.dodajKritiku(kr4);film13.dodajKritiku(kr5);film13.izracunajRejting();
        film14.dodajKritiku(kr5);film14.dodajKritiku(kr1);film14.dodajKritiku(kr6);film14.izracunajRejting();

        // filmovi u opadajucem redosledu po rejtingu
        ArrayList<Film> listaFilmova = new ArrayList<>();
        listaFilmova.add(film1);
        listaFilmova.add(film2);
        listaFilmova.add(film3);
        listaFilmova.add(film4);
        listaFilmova.add(film5);
        listaFilmova.add(film6);
        listaFilmova.add(film7);
        listaFilmova.add(film8);
        listaFilmova.add(film9);
        listaFilmova.add(film10);
        listaFilmova.add(film11);
        listaFilmova.add(film12);
        listaFilmova.add(film13);
        listaFilmova.add(film14);
        Collections.sort(listaFilmova);
        System.out.println(listaFilmova);

        FilmskaAkademija fa = new FilmskaAkademija();

        fa.nominuj(film1);
        fa.nominuj(film2);
        fa.nominuj(film3);
        fa.nominuj(film4);
        fa.nominuj(film5);
        fa.nominuj(film6);
        fa.nominuj(film7);
        fa.nominuj(film9);
        fa.nominuj(film14);
        fa.nominuj(film12);
        fa.nominuj(g1);
        fa.nominuj(g2);
        fa.nominuj(g4);
        fa.nominuj(g5);
        fa.nominuj(r1);
        fa.nominuj(r2);
        fa.nominuj(r3);
        fa.nominuj(r4);
        fa.nominuj(r5);

        System.out.println(fa.getNominacijeIzvestaj());

        fa.objaviNominacije();

        fa.ispisiStatistikuFilmova();

        fa.odrziDodelu();

    }
}
