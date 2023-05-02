package formes_geometrique;

public class testForm{

    public static void main(String[] args) {
        //test(5);

        Forme s1 = new Carre(2);
        Forme s2 = new Carre();
        Forme c2 = new Cercle();
        Forme c1 = new Cercle(2);
        compare(s1, s2);
        compare(s1, c1);
        compare(c2, s2);
        compare(c1, c2);
        System.out.println(s1);
        s1.translater(1, 1);
        System.out.println(s1);
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
