import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        List<Integer>list=new Vector<Integer>();
        Scanner scanner=new Scanner(System.in);
        int number;

        boolean ok=true;
        while(ok)
        {
            number= scanner.nextInt();
            if(number==0)
            {
                ok=false;
            }
            else
            {
                list.add(number);
            }
        }

        System.out.println("initial list");
        for(int item:list)
        {
            System.out.print(item+" ");
        }

        Random random=new Random();
        int size= list.size();
        size--;

        while(size>0){
            int index = random.nextInt(0, size);
            int temp1 = list.get(size);
            int temp2 = list.get(index);
            list.set(size, temp2);
            list.set(index, temp1);
            size--;
        }

        System.out.println("\nlist after shuffle");

        for(int item:list)
        {
            System.out.print(item+"  ");
        }

    }
}
