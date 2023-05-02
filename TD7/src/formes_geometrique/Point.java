package formes_geometrique;

public class Point {
    //private double abscisse = 0;
    //private double ordonnee = 0;
    private double rho;
    private double theta;

    public Point(double abscisse, double ordonnee) {
        //this.abscisse = abscisse;
        //this.ordonnee = ordonnee;
        rho = Math.sqrt(abscisse * abscisse + ordonnee * ordonnee);
        theta = Math.atan2(ordonnee, abscisse);
    }

    public Point() {
        this(0,0);
    }

    public double getRho() {
        return this.rho;
    }

    public double getTheta() {
        return this.theta;
    }

    public void setRho(double rho) {
        this.rho = rho;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }

    public double getAbscisse() {
        return this.rho * Math.cos(this.theta);
    }

    public double getOrdonnee() {
        return this.rho * Math.sin(this.theta);
    }

    public void setAbscisse(double abscisse) {
        double ordonnee = this.getOrdonnee();
        this.rho = Math.sqrt(abscisse * abscisse + ordonnee * ordonnee);
        this.theta = Math.atan2(ordonnee, abscisse);
    }

    public void setOrdonnee(double ordonnee) {
        double abscisse = this.getAbscisse();
        this.rho = Math.sqrt(abscisse * abscisse + ordonnee * ordonnee);
        this.theta = Math.atan2(ordonnee, abscisse);
    }

    public String toString() {
        return "(" + this.getAbscisse() + ", " + this.getOrdonnee() + ")";// ou (" + this.rho + ", " + this.theta + ")";
    }

    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point p = (Point) o;
            return this.rho == p.getRho() && this.theta == p.getTheta();
        }

        return false;
    }


    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.getAbscisse() - p.getAbscisse(), 2) + Math.pow(this.getOrdonnee() - p.getOrdonnee(), 2));
    }

    public void translater(double dx, double dy) {
        this.setAbscisse(this.getAbscisse() + dx);
        this.setOrdonnee(this.getOrdonnee() + dy);
    }

    public void rotation(double angle)
    {
        this.theta += angle;
    }
}
