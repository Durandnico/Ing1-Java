package Exercice_Recursivite;

public class Main {

    static public int exo(int n, int u0, int u1) throws SuiteException{
        if (n == 0)
            return u0;

        if (n == 1)
            return u1;

        int res = 5;

        try {

            if ( (n % 2) == 0)
                res = (exo(n - 1, u0, u1) / exo(n - 2, u0, u1)) -  (exo(n - 2, u0, u1) / exo(n - 1, u0, u1));

            else
                res = (exo(n - 2, u0, u1) / exo(n - 1, u0, u1)) - (exo(n - 1, u0, u1) / exo(n - 2, u0, u1));

        } catch (SuiteException e) {
            System.out.println(e.toString());
            e.ajouterTrace("qui est appelé dans suite(" + n + ", " + u0 + ", " + u1 + ")\n");
            throw e;
        } catch (Exception e){
            throw (SuiteException) new SuiteException("dans suite (" + n + ", " + u0 + ", " + u1 + ")\n", e);
        }
        return res;
    }

    public static void main(String[] args) {
        try{
            System.out.println(exo(10,100,1));

        }catch (SuiteException e){
            System.out.println(e.toString());
        }
    }
}
