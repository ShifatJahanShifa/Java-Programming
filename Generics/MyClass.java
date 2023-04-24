public class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] values;

    MyClass(T[] ob)
    {
        values=ob;
    }

    @Override
    public T min() {
        T v=values[0];
        for(var item:values)
        {
            if(item.compareTo(v)<0)
            {
                v=item;
            }
        }
        return v;
    }

    public T max() {
        T v=values[0];
        for(var item:values)
        {
            if(item.compareTo(v)>0)
            {
                v=item;
            }
        }
        return v;
    }
}
