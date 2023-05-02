package formes_geometrique;

public abstract class AbstractForm implements Forme {
    protected Point center;

    public AbstractForm(Point center){
        this.center = center;
    }

    public AbstractForm(){
        this.center = new Point(0,0);
    }

    public Point getCenter(){
        return this.center;
    }

    public void setCenter(Point center){
        this.center = center;
    }

    public void translater(float dx, float dy){
        this.center.translater(dx, dy);
    }

}
