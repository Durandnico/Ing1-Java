package maths.polynome;

public class Polynome{

    private Monome[] monomes;
    //private double[] coeffs;

    /*public Polynome(double[] coeffs){
        this.coeffs = coeffs;
    }*/

    public Polynome(Monome[] monomes){
        this.monomes = monomes;
    }

    public Monome[] getCoeffs(){
        return this.monomes;
    }

    public double get(int degre){

        for(Monome val : this.monomes)
            if(val.getDegre() == degre)
                return val.getCoeff();

        return 0;
    }


    public int getDegre(){
        int degre_max = 0;
        for ( Monome val : this.monomes)
        {
            if(val.getDegre() > degre_max)
                degre_max = val.getDegre();
        }

        return degre_max;
    }

    public void show(){
        for ( Monome val : this.monomes)
        {
            System.out.println(val.getCoeff() + "x^" + val.getDegre());
        }
    }

    public boolean equals(Object o)
    {
        if (o instanceof Polynome)
        {
            Polynome p = (Polynome) o;
            return this.getDegre() == p.getDegre() && equals(this, p, p.getDegre());
        }

        return false;
    }

    public static boolean equals(Polynome p, Polynome p2, int degre)
    {
        return degre < 0 || (p.get(degre) == p2.get(degre) && equals(p , p2, degre - 1) );
    }

    public double evaluate(double x)
    {
        double res = 0;
        for (Monome val : this.monomes)
        {
            res += val.getCoeff() * Math.pow(x, val.getDegre());
        }

        return res;
    }

    public Polynome derive()
    {
        int new_deg = this.monomes.length;
        for (Monome val : this.monomes)
            if(val.getDegre() == 0)
                new_deg--;


        Polynome deriv = new Polynome(new Monome[new_deg]);
        int index = 0;

        for(Monome val : this.monomes)
        {
            if(val.getDegre() == 0)
                continue;


            deriv.monomes[index++] = (new Monome(val.getCoeff() * val.getDegre(), val.getDegre() - 1));
        }

        return deriv;
    }

    public static void main(String[] args) {
        Monome[] monomes = new Monome[3];
        monomes[0] = new Monome(1, 2);
        monomes[1] = new Monome(2, 1);
        monomes[2] = new Monome(3, 0);

        Polynome p = new Polynome(monomes);
        p.show();
        System.out.println(p.getDegre());
        System.out.println(p.get(2));
        System.out.println(p.get(1));
        System.out.println(p.get(0));
        System.out.println(p.evaluate(2));
        p.derive().show();
    }
}