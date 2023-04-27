public class testPoint {

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4,3);

        System.out.println("p1 : "+ p1.toString() + ", p2 : "+ p2.toString());
        System.out.println("distance p1-p3 = " + p1.distance(p2));
        System.out.println("p1.equals(p2) ? " + p1.equals(p2));
        System.out.println("moving p1 to p2");
        p1.translater(3,1);

        System.out.println("p1 == p2 ? " + (p1 == p2));
        System.out.println("p1.equals(p2) ? " + p1.equals(p2));

        Point p3 = p1;
        p3.setAbscisse(1);
        System.out.println("p1 : " + p1.toString() + ", p2 : "+ p2.toString() + ", p3 (référence) : " + p3.toString());
        p2.rotation(Math.PI);
        System.out.println("p2 rotation 180° : " + p2.toString());
    }
}
