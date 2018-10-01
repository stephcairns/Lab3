/**
 Change the Measurer Interface from Chapter 9 (provided below)
 to a generic interface. Provide a static method
 T max(T[] values, Measurer<T> meas).
 */
public interface Measurer<T>
{
    /**
     Computes the measure of an object.
     @param anObject the object to be measured
     @return the measure
     */
    double measure(Object anObject);


    //add max to your generic interface
    static <T> T max(T[] values, Measurer<T> meas)
    {
        double maxDistance = 0;
        T maxValue = null;
        for(T value: values)
        {
            double dist = meas.measure(value);
            if (dist > maxDistance)
            {
                maxDistance = dist;
                maxValue = value;
            }
        }
        return maxValue;
    }
}