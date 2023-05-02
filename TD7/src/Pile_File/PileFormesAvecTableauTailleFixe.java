package Pile_File;

import formes_geometrique.Forme;

public class PileFormesAvecTableauTailleFixe implements PileFormes {
    protected Forme pile[];
    protected int taille_max;
    protected int taille = -1;
    public PileFormesAvecTableauTailleFixe (int taille_max)
    {
        this.taille_max =  taille_max;
        this.pile = new Forme[taille_max];
    }

    public int getTaille()
    {
        return this.taille;
    }

    @Override
    public int getTaille_max()
    {
        return this.taille_max;
    }

    @Override
    public int taille()
    {
        return this.taille + 1;
    }

    @Override
    public boolean estVide()
    {
        return this.taille == -1;
    }

    @Override
    public boolean estPleine() {
        return this.taille == this.taille_max - 1;
    }

    @Override
    public Forme sommet()
    {
        if( ! estVide() )
            return this.pile[this.taille];

        return null;
    }

    @Override
    public void empiler(Forme f)
    {
        if( !estPleine())
            this.pile[++this.taille] = f;
    }

    @Override
    public Forme depiler()
    {
        if( !estVide())
            return this.pile[this.taille--];

        return null;
    }

    @Override
    public void vider()
    {
        this.taille = -1;
    }

    @Override
    public void afficher(){
        for(int i = 0; i <= taille; ++i)
            System.out.println( "| "+pile[i].toString() + " | ");
    }
}
