import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reflection {
    ObjectFeature object=new ObjectFeature();
    Class objectFeatures=object.getClass();

    Field[] fields= objectFeatures.getFields();
    List<String> list=new ArrayList<String>();

    public String getComparedFieldName()
    {
        for (var item:fields)
        {
            list.add(item.getName());
        }

        Collections.sort(list);
        String value=list.get(0);
        return value;
    }
}
