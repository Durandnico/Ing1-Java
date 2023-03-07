package maths.polynome;

public class Polynome{

    private double[] coeffs;

    public Polynome(double[] coeffs){
        this.coeffs = coeffs;
    }


    public double[] getCoeffs(){
        return this.coeffs;
    }

    public double get(int degre){
        if(degre > this.coeffs.length)
            return 0;

        return this.coeffs[degre];
    }

    public void setCoeff(int degre, double value){
        if(degre > this.coeffs.length)
            return;

        this.coeffs[degre] = value;
    }

    public int getDegre(){
        return this.coeffs.length - 1;
    }

    public void toString(){
        System.out.printf("%dx^%d", this.coeffs[this.coeffs.length - 1], this.coeffs.length - 1);
        for(int i = this.coeffs.length - 2; i >= 0; --i){
            System.out.printf(" %c %dx^%d", (this.coeffs[i] > 0) ? '+' : '-', this.coeffs[i], i);
        }
        System.out.printf("\n");
    }


    public static void main(String[] args) {
        Polynome P = new Polynome(1,2,3);
        P.toString();
    }
}