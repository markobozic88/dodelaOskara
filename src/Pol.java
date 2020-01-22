public enum Pol {
    MUSKI(1), ZENSKI(2);

    private final int izabraniPol;

    Pol(int izabraniPol){
        this.izabraniPol = izabraniPol;
    }

    public int getIzabraniPol() {
        return izabraniPol;
    }

}
