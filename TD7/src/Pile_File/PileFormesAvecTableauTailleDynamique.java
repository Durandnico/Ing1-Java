package Pile_File;

import formes_geometrique.Forme;

public class PileFormesAvecTableauTailleDynamique extends PileFormesAvecTableauTailleFixe {
        public PileFormesAvecTableauTailleDynamique ()
        {
            super(1);
        }

        @Override
        public void empiler(Forme f)
        {
            if( !estPleine())
                this.pile[++this.taille] = f;
            else {
                Forme[] new_pile = new Forme[this.getTaille_max() * 2 + 1];
                int i = 0;
                while( ! estVide() )
                    new_pile[i++] = this.depiler();

                new_pile[i] = f;
                this.pile = new_pile;
                this.taille_max = this.getTaille_max() * 2 + 1;
                this.taille = i;
                System.out.println("Pile agrandie");
            }
        }
}
