public class TD2 {
    public static void main(String[] args) {


        /*Exercice 2 */
        for(int i = 0; i < 7; i++)
            System.out.println(TD2.exercice2_1((i+1)%2));

    }

    static void exercice1(int x, int y){
        /*Exercice 1*/

        if( x > 3 && y > 3 )
            System.out.println("x,y > 3\n");

        if (x == y)
            System.out.println("x = y\n");

        if (y <= x && x <= z && y < z)
            System.out.println(" y <= x <= z ET y < z\n");

        if ((x == y + y == z + z == x) >= 2)
            System.out.println("2 valeurs au moins sont identique");

        if ((x == y + y == z + z == x) <= 2)
            System.out.println("2 valeurs au plus sont identique");
    }

    static String exercice2_1(int day){
        String[] table = {"Dimanche", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi"};

        return table[day];
    }


}
