package Exercice1;

public class Point3D extends Point2D {
    private double cote;

    public Point3D(double abscisse, double ordonnee, double cote){
        super(abscisse, ordonnee);
        this.cote = cote;
    }

    public double getCote(){
        return cote;
    }

    public void setCote(double cote){
        this.cote = cote;
    }

    public String toString(){
        return "(" + this.getAbscisse() + ", " + this.getOrdonnee() + ", " + cote + ")";
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Point3D) {
            Point3D p = (Point3D) o;
            return super.equals(p) && this.getCote() == p.getCote();
        }
        return false;
    }


    static void afficherEgaux(Point1D[] arr, Point1D p){
        for(Point1D point : arr){
            if(p.equals(point)){
                System.out.println(point);
            }
        }
    }

    static void test(){
        Point1D[] arr = new Point1D[12];
        for(int i = 0; i < 4; i++){
            arr[i] = new Point1D(Math.random());
        }

        for(int i = 4; i < 8; i++){
            arr[i] = new Point2D(Math.random(), Math.random());
        }

        for(int i = 8; i < 12; i++){
            arr[i] = new Point3D(Math.random(), Math.random(), Math.random());
        }

        Point1D p = new Point1D(0.5);

        /* print all point */
        for(Point1D point : arr){
            System.out.println(point);
        }
        System.out.println("Point p = " + p);
        System.out.println("starting test : ");
        afficherEgaux(arr, p);

    }

    public static void main(String[] args) {
        /* 6 : pas sur d'avoir compris la question*/
        /* j'ai juste décalé le main dans la fonction test()*/
        test();

        /* 7 :
        *       1)  alors il est possible d'écrire Exercice1.Point1D p = new Exercice1.Point2D(1, 2); car... Magic
        *           nan mais en gros Exercice1.Point2D est une sous classe de Exercice1.Point1D donc on peut ( 3 * 5 = 15 donc c'est possible )
        *
        *       2) Sans héritage on devrait recopier les méthodes de Exercice1.Point1D dans Exercice1.Point2D et Exercice1.Point3D et ainsi de suite
        *
        *       3) sans héritage la méthode equals serait un peut malaise
        *
        *       4) Sans héritage il faut soit faire un tableau de Object soit faire une interface
        */
    }

    }
