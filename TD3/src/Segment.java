public class Segment {

    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    /*public Segment(Segment s)
    {
        this(s.p1, s.p2);
    }*/
    public Segment(Segment s)
    {
        this( new Point(s.getP1().getAbscisse(), s.getP1().getOrdonnee()) , new Point(s.getP2().getAbscisse(), s.getP2().getOrdonnee()));
    }

    public void setP1(Point p)
    {
        this.p1 = p;
    }

    public void setP2(Point p)
    {
        this.p2 = p;
    }

    public Point getP1()
    {
        return this.p1;
    }

    public Point getP2()
    {
        return this.p2;
    }

    public boolean equals (Object o)
    {
        if(o instanceof Segment)
        {
            Segment s2 = (Segment) o;
            return s2.getP1() == this.p1 && s2.getP2() == this.p2;
        }

        return false;
    }

    public String toString()
    {
        return "Segment entre ( " + this.getP1().toString() + " ) et ( "+ this.getP2().toString() + " )";
    }

    public static void main(String[] args) {
        Segment s1 = new Segment(new Point(), new Point(1, 1));
        Segment s2 = new Segment(s1);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        s1.getP1().translater(1, 1);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}
