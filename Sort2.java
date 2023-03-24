import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort2 {
    private static final String[] suits={"Hearts","Diamonds","Clubs","Spades"};

    public void printElements()
    {
        List<String>list=Arrays.asList(suits);
        System.out.println("before sorting");
        for(String item:list)
        {
            System.out.print(item+" ");
        }
        System.out.println("");

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("after sorting");
        for(String item:list)
        {
            System.out.print(item+" ");
        }
    }

    public static void main(String[] args) {
        Sort2 sort2=new Sort2();
        sort2.printElements();
    }
}

