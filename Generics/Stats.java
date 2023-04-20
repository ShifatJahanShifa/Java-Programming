public class Stats<T extends Number> {
    T[] num;
    Stats(T[] o)
    {
        num=o;
    }

    double calculateAverage()
    {
        double sum=0.0;
        for(var item:num)
        {
            sum+=item.doubleValue();
        }
        return sum/ num.length;
    }

    boolean isSameAverage(Stats<?> ob)
    {
        return (calculateAverage()== ob.calculateAverage());
    }
}
