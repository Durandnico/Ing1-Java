package formes_geometrique;

public class Cercle extends AbstractForm {
    private float radius;

    public Cercle(float rad, Point center){
        super(center);
        radius = rad;
    }

    public Cercle(float rad){
        super();
        radius = rad;
    }

    public Cercle(){
        this(1);
    }

    //getters and setters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }


    @Override
    public String toString(){
        return new String("cercle of radius : " + this.radius + " and area : " + this.air());
    }

    @Override
    public float air() {
        return (float) (Math.PI * this.radius * this.radius);
    }

    public static void main(String[] args) {
        Cercle c = new Cercle(1);
        System.out.println("area is : " + c.air());
    }
}
