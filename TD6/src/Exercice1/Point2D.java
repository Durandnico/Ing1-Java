package Exercice1;

public class Point2D extends Point1D {
    private double ordonnee;

    public Point2D(double abscisse, double ordonnee) {
        super(abscisse);
        this.ordonnee = ordonnee;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }

    public String toString() {
        return "(" + super.getAbscisse() + ", " + ordonnee + ")";
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Point2D) {
            Point2D p = (Point2D) o;
            return super.equals(p) && this.getOrdonnee() == p.getOrdonnee();
        }
        return false;
    }

    public static void main(String[] args) {
        Point1D p1 = new Point1D(1);
        Point2D p2 = new Point2D(1, 2);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
    }
}
