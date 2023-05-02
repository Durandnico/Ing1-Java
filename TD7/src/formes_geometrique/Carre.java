package formes_geometrique;

public class Carre extends AbstractForm{
    private float len;

    public Carre(float ln, Point center){
        super(center);
        len = ln;
    }

    public Carre(float ln){
        super();
        len = ln;
    }

    public Carre(){
        this(1);
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
