public class Kritika {
    private double ocena;
    private Kriticar kriticar;
    public Kritika(Kriticar kriticar, double ocena){
        this.kriticar = kriticar;
        this.ocena = ocena;
    }
    public Kriticar getKriticar() {
        return kriticar;
    }
    public void setKriticar(Kriticar kriticar) {
        this.kriticar = kriticar;
    }
    public double getOcena() {
        return ocena;
    }
    public void setOcena(double ocena) {
        this.ocena = ocena;
    }
    @Override
    public String toString() {
        return "Kriticar: " + getKriticar() + ", Ocena: " + getOcena();
    }
}
