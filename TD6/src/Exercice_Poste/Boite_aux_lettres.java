package Exercice_Poste;

import java.util.jar.Manifest;

public class Boite_aux_lettres {
    private int nbCourrier;

    private int nbCourrierMax;
    private final Courrier[] courriers;

    public Boite_aux_lettres(int nbCourrierMax) {
        this.nbCourrier = 0;
        this.nbCourrierMax = nbCourrierMax;
        this.courriers = new Courrier[nbCourrierMax];
    }

    public int getNbCourrier() {
        return nbCourrier;
    }

    public void setNbCourrier(int nbCourrier) {
        this.nbCourrier = nbCourrier;
    }

    public Courrier[] getCourriers() {
        return courriers;
    }

    public void ajouter(Courrier c) {
        if(c.isValide()) {
            this.courriers[this.nbCourrier++] = c;
        }
    }

    public void aff() {
        for(int i = 0; i < this.nbCourrier; i++) {
            this.courriers[i].afficher();
        }
    }

    public int cost() {
        int cost = 0;
        for(int i = 0; i < this.nbCourrier; i++) {
            cost += this.courriers[i].getTarif();
        }
        return cost;
    }

    @Override
    public String toString() {
        return "Boite_aux_lettres{" + "nbCourrier=" + nbCourrier + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Boite_aux_lettres) {
            Boite_aux_lettres b = (Boite_aux_lettres) obj;
            return this.getNbCourrier() == b.getNbCourrier();
        }
        return false;
    }

    public static void main(String[] args) {
        Boite_aux_lettres B = new Boite_aux_lettres(50);
        Courrier C1 = new Lettre("Moi", 100, Courrier.eType.NORMAL, Lettre.format.A4);
        Courrier C2 = new Lettre("Moi", 100, Courrier.eType.EXPRESS, Lettre.format.A3);
        Courrier C3 = new Magazine("Moi", 100, Courrier.eType.NORMAL);
        Courrier C4 = new Magazine("Moi", 100, Courrier.eType.EXPRESS);
        Courrier C5 = new Colis("Moi", 100, Courrier.eType.NORMAL, 100);
        Courrier C6 = new Colis("Moi", 100, Courrier.eType.EXPRESS, 100);
        B.ajouter(C1);
        B.ajouter(C2);
        B.ajouter(C3);
        B.ajouter(C4);
        B.ajouter(C5);
        B.ajouter(C6);

        /* courrier invalide */
        B.ajouter(new Lettre(null, 100, Courrier.eType.NORMAL, Lettre.format.A5));
        B.ajouter(new Magazine("Moi", 0, Courrier.eType.NORMAL));
        B.ajouter(new Colis("Moi", 100, Courrier.eType.NORMAL, 0));

        System.out.println("-----------------------------------------------------------");
        B.aff();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Coût total : " + B.cost());
        System.out.println("-----------------------------------------------------------");

    }
}
