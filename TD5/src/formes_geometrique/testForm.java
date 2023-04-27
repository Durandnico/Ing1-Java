package formes_geometrique;

import formes_geometrique.Carre;
import formes_geometrique.Cercle;
import formes_geometrique.Forme;

public class testForm{

    public static void main(String[] args) {
        test(5);
    }

    public static void compare(Forme f1, Forme f2){
        if(f1.air() > f2.air()){
            System.out.println(f1.toString() + " is bigger than " + f2.toString());
        }else{
            System.out.println(f2.toString() + " is bigger than " + f1.toString() + " or they are equal");
        }
    }

    public static void test(int n){
        Forme f[] = new Forme[2];
        for(int i = 0; i < n; ++i) {
            for (int j = 0; j < 2; ++j) {
                if ((int) (Math.random() * 2)%2 == 0) {
                    f[j] = new Carre((float) Math.random() * 10);
                }
                else {
                    f[j] = new Cercle((float) Math.random() * 10);
                }
            }
            compare(f[0], f[1]);
        }
    }
}
