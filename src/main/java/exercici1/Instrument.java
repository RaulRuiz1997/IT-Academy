package exercici1;

public abstract class Instrument {

    private String nom;
    private double preu;

    // Inicialización estática de la clase
    static {
        System.out.println("Inicialització d'un Block static");
    }

    {
        System.out.println("Inicialització d'un Block d'instancia");
    }

    public Instrument(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public abstract void tocar();

}
