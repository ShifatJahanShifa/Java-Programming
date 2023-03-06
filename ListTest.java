import java.util.LinkedList;
import java.util.List;

public class ListTest {
    private static final String[] colors1={
            "black","yellow","green","blue","violet","silver"
    };

    private static final String[] colors2={
            "gold","white","brown","blue","gray","silver"
    };

    // constructor doing set up linked list and manipulate
    public ListTest()
    {
        List<String>list1=new LinkedList<String>();
        List<String>list2=new LinkedList<String>();

        // adding elements colors1 and colors2
        for(String color:colors1)
        {
            list1.add(color);
        }
        for(String color:colors2)
        {
            list2.add(color);
        }
    }


}
