package Exercice_Poste;

public class Magazine extends Courrier {

    public Magazine (String destinataire, double poids, eType mode) {
        super(destinataire, poids, mode);
    }

    @Override
    public void afficher() {
        System.out.println("Magazine");
        super.afficher();
        System.out.print("\n");
    }

    @Override
    public double getTarif() {
        return 5. * (getPoids()/1000) * (getMode() == eType.EXPRESS ? 2 : 1);
    }
}
