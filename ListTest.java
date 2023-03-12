import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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

        list1.addAll(list2);
        list2=null;  // no need of list2
        printList(list1);

        convertToUppercaseStrings(list1);
        printList(list1);

        System.out.println("deleting elements from 4 to 6");
        removeItems(list1,4,7);  // 4 inclusive , 7 exclusive
        printList(list1);
        printReversedList(list1);
    }

    // implementation of printList function
    public void printList(List<String>list)
    {
        System.out.println("list: ");
        for(String color:list)
            System.out.print(color+" ");
        System.out.println("");
    }

    private void convertToUppercaseStrings(List<String>list)
    {
        ListIterator<String>iterator= list.listIterator();

        while (iterator.hasNext())
        {
            String color= iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private void removeItems(List<String>list,int start,int end)
    {
        list.subList(start,end).clear();
    }

    public void printReversedList(List<String>list)
    {
        ListIterator<String>iterator= list.listIterator(list.size());

        while (iterator.hasPrevious())
        {
            System.out.print(iterator.previous()+" ");
        }
    }


    public static void main(String[] args) {
        new ListTest();
    }
}
