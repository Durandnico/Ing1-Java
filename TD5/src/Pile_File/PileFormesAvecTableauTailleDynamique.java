package Pile_File;

import formes_geometrique.Forme;

public class PileFormesAvecTableauTailleDynamique implements PileFormes{
        private Forme pile[];
        private int taille_max;
        private int taille = -1;
        public PileFormesAvecTableauTailleDynamique ()
        {
            this.taille_max =  1;
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
