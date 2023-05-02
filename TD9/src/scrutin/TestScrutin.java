package scrutin;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestScrutin {

    public static void main(String[] args) {

        Set<Vote> s = new HashSet<Vote>();
        s.add(Vote.OUI);
        s.add(Vote.NON);

        MajoriteAbsolue test = new MajoriteAbsolue(s, 200);

        for (int i = 0; i < 175; i++) {
            try {
                if (new Random().nextBoolean())
                    test.ajouterVote(Vote.NON);
                else
                    test.ajouterVote(Vote.OUI);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        test.cloture();

        try {
            test.afficherResultats();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Vainqueur : " + test.getVainqueur());
    }
}
