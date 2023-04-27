package Pile_File;

import formes_geometrique.*;
public class testPileFormes {
    public static void main(String[] args) {
        PileFormes p = new PileFormesAvecTableauTailleFixe(6);
        //PileFormes p = new PileFormesAvecTableauTailleDynamique();
        p.empiler(new Carre(2));
        p.empiler(new Carre(3));
        p.empiler(new Carre(4));
        p.empiler(new Cercle(1));
        p.empiler(new Cercle(2));
        p.empiler(new Cercle(3));
        p.empiler(new Carre(5));

        p.afficher();

        System.out.println("size of pile is : " + p.taille());
        System.out.println("is pile empty ? : " + p.estVide());
        System.out.println("is pile full ? : " + p.estPleine());
        System.out.println("top of pile is : " + p.sommet());

        p.depiler();
        p.depiler();

        System.out.println("size of pile is : " + p.taille());
        System.out.println("is pile empty ? : " + p.estVide());
        System.out.println("is pile full ? : " + p.estPleine());
        System.out.println("top of pile is : " + p.sommet());

        p.vider();
        System.out.println("size of pile is : " + p.taille());
        System.out.println("is pile empty ? : " + p.estVide());
        System.out.println("is pile full ? : " + p.estPleine());
        System.out.println("top of pile is : " + p.sommet());

    }
}
