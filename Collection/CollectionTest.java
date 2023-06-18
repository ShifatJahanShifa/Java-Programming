import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    private static final String[] colors={
            "MAGENTA","RED","WHITE","BLUE","CYAN"
    };

    private static final String[] removeColors={
            "RED","WHITE","BLUE"
    };

    // constructor
    public CollectionTest()
    {
        List<String>list=new ArrayList<String>();
        List<String>removeList=new ArrayList<String>();

        // adding elements in the list and removelist
        for(String color:colors)
        {
            list.add(color);
        }
        for(String color:removeColors)
        {
            removeList.add(color);
        }

        // elements in the list, using get method of List class
        System.out.println("at first ArrayList");
        for (int i=0;i< list.size();i++)
        {
            System.out.printf("%s ",list.get(i));
        }
        System.out.println("");

        // a method for removing colors contained in removeList
        removeColors(list,removeList);

        System.out.println("ArrayList after removing colors");

        // elements in the List, for each way to print the elements of an arraylist
        for (String color:list) {
            System.out.print(color+" ");
        }
    }

    private void removeColors(Collection<String>collection1,Collection<String>collection2)
    {
        // get iterator
        Iterator<String>iterator=collection1.iterator();

        // loop while collection has elements
        while (iterator.hasNext())
        {
            if (collection2.contains(iterator.next()))
            {
                iterator.remove();  // removing current color
            }
        }
    }

    public static void main(String[] args) {
        new CollectionTest();
    }
}