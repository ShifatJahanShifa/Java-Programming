import java.lang.reflect.Field;
import java.util.Comparator;

public class ObjectComparator implements Comparator<ObjectFeature> {
    Reflection reflection=new Reflection();
    private String comparedValue= reflection.getComparedFieldName();

    public int compare(ObjectFeature ob1,ObjectFeature ob2)
    {
        try {
            Field field = ObjectFeature.class.getField(comparedValue);
            Object value1=field.get(ob1);
            Object value2=field.get(ob2);

            if(value1 instanceof Comparable && value2 instanceof Comparable)
            {
                return ((Comparable) value1).compareTo(value2);
            }
        }
        catch (NoSuchFieldException noSuchFieldException)
        {
            noSuchFieldException.printStackTrace();
        }
        catch (IllegalAccessException illegalAccessException)
        {
            illegalAccessException.printStackTrace();
        }
        return 0;
    }
}
