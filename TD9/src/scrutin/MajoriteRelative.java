package scrutin;

import java.util.Map;
import java.util.Set;

public class MajoriteRelative extends MajoriteAbsolue
{
    public MajoriteRelative(Set<Vote> s, int nbElecteurs)
    {
        super(s, nbElecteurs);
    }


    @Override
    public Vote getVainqueur() {
        Vote res = Vote.NUL;
        int nb = -1;
        int totalvotes = 0;
        int totalnulblanc = 0;

        for(Map.Entry<Vote, Integer> e : resultat.entrySet())
        {
            totalvotes += e.getValue();
            if(e.getKey() != Vote.BLANC && e.getKey() != Vote.NUL)
            {
                if(e.getValue() > nb) {
                    res = e.getKey();
                    nb = e.getValue();
                }
                else if (e.getValue() == nb)
                    res = Vote.NUL;
            }
            else if (e.getKey() == Vote.BLANC || e.getKey() == Vote.NUL)
                totalnulblanc += e.getValue();
        }

        if( res == Vote.NUL || totalnulblanc / totalvotes > 0.85)
            return Vote.NUL;

        return res;
    }
}
