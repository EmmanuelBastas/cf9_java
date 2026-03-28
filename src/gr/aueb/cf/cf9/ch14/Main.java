package gr.aueb.cf.cf9.ch14;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point2D p2 = new Point2D(2, 5.5);
        Point3D p3 = new Point3D(2, 5.5, 10);


        p1.movePlusOne();
        p2.movePlus10();
        p3.movePlusOne();

        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);
    }

    public static void doMovePlus10(Point p) {
        p.movePlus10();         // late binding
    }
}
