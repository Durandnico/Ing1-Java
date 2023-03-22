package Exercice_Poste;

public abstract class Courrier {
    enum eType {
        NORMAL,
        EXPRESS
    };

    private String destinataire;
    private double poids;
    private eType mode;

    public Courrier(String destinataire, double poids, eType mode){
        this.destinataire = destinataire;
        this.poids = poids;
        this.mode = mode;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public eType getMode() {
        return mode;
    }

    public void setMode(eType mode) {
        this.mode = mode;
    }

    public String isExpress() {
        return (getMode() == eType.EXPRESS) ? "True" : "False";
    }
    public void afficher(){
        System.out.println("Destinataire : " + getDestinataire() + "\nPoids : " + getPoids() + " grammes\nExpress " + isExpress() + "\nPrix : " + getTarif());
    };

    public void envoyer(Boite_aux_lettres b){
        b.ajouter(this);
    };

    public abstract double getTarif();

    public boolean isValide() {
        return getDestinataire() != null;
    }
}
