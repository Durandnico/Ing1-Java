package formes_geometrique;

public class Carre implements Forme {
    private float len;

    public Carre(float ln){
        len = ln;
    }

    //getters and setters
    public float getLen() {
        return len;
    }

    public void setLen(float len) {
        this.len = len;
    }

    @Override
    public String toString(){
        return new String("square of length : " + this.len + " and area : " + this.air());
    }

    @Override
    public float air(){
        return this.len * this.len;
    }



    public static void main(String[] args) {
        Carre c = new Carre(2);
        System.out.println("area of square is : "+ c.air());
    }
}
