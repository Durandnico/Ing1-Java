import java.util.Vector;

public class TD2 {
    public static void main(String[] args) {

        /*Exercice 2.2 */
        for (int i = 0; i < 7; i++)
            System.out.println(TD2.exercice2_1((i + 1) % 7));

        System.out.println(TD2.zeller(30, 11, 20, 22));

        System.out.printf("Pi ~= %.10f et ausi %.10f\n", TD2.machin(100000), TD2.machin2());
    }

    static void exercice1(int x, int y, int z) {
        /*Exercice 1*/

        if (x > 3 && y > 3)
            System.out.println("x,y > 3\n");

        if (x == y)
            System.out.println("x = y\n");

        if (y <= x && x <= z && y < z)
            System.out.println(" y <= x <= z ET y < z\n");

        int count = 0;
        count += (x == y) ? 1 : 0;
        count += (y == z) ? 1 : 0;
        count += (z == x) ? 1 : 0;
        if (count >= 2)
            System.out.println("2 valeurs au moins sont identique");

        if (count <= 2)
            System.out.println("2 valeurs au plus sont identique");
    }

    static String exercice2_1(int day) {
        String[] table = {"Dimanche", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi"};

        return table[day];
    }

    static String zeller(int j, int m, int ss, int aa) {
        return TD2.exercice2_1((int) (((13.0 * m - 1) / 5. + j + aa + aa / 4.0 + ss / 4. - 2 * ss) % 7));
    }

    static double machin(int n) {
        double pi = 0;
        int signe = 1;
        double S1 = 16. / 5, S2 = 4. / 239;

        for (int i = 0; i < n; i++) {
            pi += ((double) signe / (2. * i + 1.)) * (S1 - S2);
            S1 /= 25;
            S2 /= 239 * 239;
            signe *= -1;
        }

        return pi;
    }


    static double machin2()
    {
        double pi = 0;
        int signe = 1;
        double S1 = 16. / 5, S2 = 4. / 239;
        int i = 0;
        while (S1 - S2 != 0F) {
            pi += ((double) signe / (2. * i++ + 1.)) * (S1 - S2);
            S1 /= 25;
            S2 /= 239 * 239;
            signe *= -1;
        }

        return pi;
    }

    /* 7. retourne un double, aucune idée du pb */    

    /* représentation mémoire */

}


/*class for a point un a plan */
class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

class Line{
    private int x1, x2, y1, y2;

    public Line(int x1, int y1, int x2,  int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public String toString() {
        return "(" + x1 + "," + y1 + ") -> (" + x2 + "," + y2 + ")";
    }

}

/* class rectangle */
class Rectangle {
    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

/* both rectangle and line use point so we should use héritage */