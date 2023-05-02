package Pile_File;
import formes_geometrique.Forme;

public interface PileFormes {
    void empiler(Forme f);

    Forme depiler();

    int taille();

    void vider();

    boolean estVide();

    boolean estPleine();

    Forme sommet();

    void afficher();

    public int getTaille_max();


}
