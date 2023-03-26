import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
    private Character[] letters={'P','C','M'};
    private Character[] copyLetters;
    private List<Character> list;
    private List<Character> copyList;

    public Algorithms1()
    {
        list= Arrays.asList(letters);
        System.out.println("initial list");
        output(list);

        Collections.reverse(list);
        System.out.println("\nlist after reversing");
        output(list);

        copyLetters=new Character[3];
        copyList=Arrays.asList(copyLetters);
        Collections.copy(copyList,list);
        System.out.println("\nlist after copying");
        output(copyList);

        Collections.fill(list,'R');
        System.out.println("\nlist after filling");
        output(list);
    }

    private void output(List<Character> listRef)
    {
        for (Character item:listRef)
        {
            System.out.print(item+" ");
        }

        System.out.println("\nMax element: "+Collections.max(listRef));
        System.out.println("Min element: "+Collections.min(listRef));
    }


    public static void main(String[] args) {
        new Algorithms1();
    }
}
