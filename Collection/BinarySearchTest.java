import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    private static final String[] colors={"red","white","blue","black",
    "yellow","purple","tan","pink"};
    private List<String>list;

    public BinarySearchTest()
    {
        list=new ArrayList<String>(Arrays.asList(colors));
        Collections.sort(list);
        System.out.println("Sorted array list: "+list);
    }

    private void search()
    {
        printSearchResults(colors[3]);
        printSearchResults(colors[0]);
        printSearchResults(colors[7]);
        printSearchResults("aqua");
        printSearchResults("gray");
        printSearchResults("teal");
    }

    private void printSearchResults(String key)
    {
        int result=0;
        System.out.println("Searching for "+key);
        result=Collections.binarySearch(list,key);

        if(result>=0) System.out.println("found at index "+result);
        else System.out.println("not found");
    }

    public static void main(String[] args) {
        BinarySearchTest binarySearchTest=new BinarySearchTest();
        binarySearchTest.search();
    }
}
