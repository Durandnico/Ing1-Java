package maths.polynome;

public class Monome {

    private double coeff;
    private int degre;

    public Monome(double coeff, int degre){
        this.coeff = coeff;
        this.degre = degre;
    }

    public double getCoeff(){
        return this.coeff;
    }

    public int getDegre(){
        return this.degre;
    }

    public void setCoeff(double coeff){
        this.coeff = coeff;
    }

    public void setDegre(int degre){
        this.degre = degre;
    }


}
