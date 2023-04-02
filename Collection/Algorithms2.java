import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Algorithms2 {
    private String[] colors={"red","white","yellow","blue"};
    private List<String>list;
    private Vector<String>vector=new Vector<String>();

    public Algorithms2()
    {
        list= Arrays.asList(colors);
        vector.add("black");
        vector.add("red");
        vector.add("green");

        System.out.println("before addAll, vector contains: ");
        for (String item:vector)
            System.out.print(item+" ");
        System.out.println();

        Collections.addAll(vector,colors);

        System.out.println("after addAll, vector contains: ");
        for (String item:vector)
            System.out.print(item+" ");
        System.out.println();

        int frequency=Collections.frequency(vector,"red");
        System.out.println("frequency of red: "+frequency);

        boolean disjoint=Collections.disjoint(list,vector);
        System.out.println(disjoint? "disjoint":"not disjoint");
    }

    public static void main(String[] args) {
        new Algorithms2();
    }
}
