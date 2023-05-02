package scrutin;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public class MajoriteAbsolue {
    protected Map<Vote, Integer> resultat = new HashMap<Vote, Integer>();
    protected Set<Vote> votesPossibles;
    protected boolean clos;
    protected int nbElecteurs;
    public MajoriteAbsolue(Set<Vote> votepossibles,int nbElecteurs)
    {
        this.nbElecteurs = nbElecteurs;

        this.votesPossibles = votepossibles;
        this.votesPossibles.add(new Vote("NUL"));
        this.votesPossibles.add(new Vote("BLANC"));

        this.clos = false;

        for (Vote v: votepossibles)
            resultat.put(v, 0);
    }

    public Set<Vote> getVotesPossibles () {
        return this.votesPossibles;
    }

    public void ajouterVote(Vote v) throws Exception
    {
        /* if vote clos*/
        if ( this.clos )
            throw new Exception();

        /* if vote not in the list of possible */
        if ( !votesPossibles.contains(v) ) {
            this.resultat.put(Vote.NUL, this.resultat.get(Vote.NUL) + 1);
            return;
        }

        this.resultat.put(v, this.resultat.get(v) + 1);
    }

    public void afficherResultats() throws Exception
    {
        if ( !this.clos)
            throw new Exception();

        int totalvotes = 0;
        for ( Map.Entry<Vote, Integer> e : resultat.entrySet())
        {
            System.out.println(e.getKey() + " : " + e.getValue());
            totalvotes += e.getValue();
        }

        System.out.println("Total votes : " + totalvotes);
    }

    public void cloture()
    {
        this.clos = true;
    }

    public Vote getVainqueur()
    {
        Vote res = Vote.NUL;
        Integer nb = -1;
        int totalvotes = 0;

        for(Map.Entry<Vote, Integer> e : resultat.entrySet())
        {
            if(e.getKey() != Vote.BLANC && e.getKey() != Vote.NUL)
            {
                totalvotes += e.getValue();
                if(e.getValue() > nb) {
                    res = e.getKey();
                    nb = e.getValue();
                }
                else if (e.getValue() == nb)
                    res = Vote.NUL;
            }
        }

        System.out.println("Total votes : " + totalvotes);
        System.out.println("Winner votes : " + nb);
        System.out.println("ratio votes : " + (double) nb / totalvotes);
        if ((double) nb / totalvotes > 0.5)
            return res;

        return Vote.NUL;
    }
}
