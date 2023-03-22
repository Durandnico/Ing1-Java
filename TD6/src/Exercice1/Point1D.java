package Exercice1;

public class Point1D {
    private double abscisse;

    public Point1D(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public String toString() {
        return "(" + abscisse + ")";
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point1D) {
            Point1D p = (Point1D) obj;
            return this.getAbscisse() == p.getAbscisse();
        }
        return false;
    }
}
