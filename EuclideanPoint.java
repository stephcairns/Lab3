import java.awt.Point;

public class EuclideanPoint extends Point implements Measurer
{

    double mXEuclid;
    double mYEuclid;

    public EuclideanPoint(double x, double y)
    {
        mXEuclid = x;
        mYEuclid = y;
    }

    @Override
    public double measure(Object anObject)
    {
        Point point = (Point)anObject;
        double xPoint = point.getX();
        double yPoint = point.getY();
        return Math.sqrt(Math.pow((mXEuclid-xPoint),2)+Math.pow((mYEuclid-yPoint),2));

    }



}
