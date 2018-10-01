import java.awt.Point;

public class Driver
{

    public static void main(String[] args) {

        // create some points
        Point p0 = new Point (3, 4);
        Point p1 = new Point (4, 5);
        Point p2 = new Point (4, 2);
        Point p3 = new Point (-5, 1);

        EuclideanPoint op = new EuclideanPoint(0,0);
        System.out.println(op.measure(p0));
        System.out.println(op.measure(p1));
        System.out.println(op.measure(p2));
        System.out.println(op.measure(p3));

        Point[] values = {p0,p1,p2,p3};
        System.out.println(Measurer.max(values,op));



    }

}
