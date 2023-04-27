public class Cercle implements Forme {
    private float radius;

    Cercle(float rad){
        radius = rad;
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
