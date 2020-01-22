public class Kritika {

    private double ocena;

    public Kritika(Kriticar kriticar, double ocena){


    }

    public Kriticar getKriticar(){
        return null;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    @Override
    public String toString() {
        return "Kritika{" +
                "ocena=" + ocena +
                '}';
    }
}
