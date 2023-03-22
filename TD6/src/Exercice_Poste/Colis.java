package Exercice_Poste;

public class Colis extends Courrier{
    private double volume;

    public Colis(String destinataire, double poids, eType mode, double volume) {
        super(destinataire, poids, mode);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void afficher() {
        System.out.println("Colis");
        super.afficher();
        System.out.println("Volume" + getVolume() + "\n");
    }

    @Override
    public double getTarif() {
        return ((0.25 * getVolume()) + getPoids()) * (getMode() == eType.EXPRESS ? 2 : 1);
    }

    @Override
    public boolean isValide() {
        return super.isValide() && getVolume() > 0;
    }
}
