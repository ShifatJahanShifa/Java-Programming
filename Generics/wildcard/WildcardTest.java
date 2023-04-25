import java.util.ArrayList;
import java.util.Arrays;

public class WildcardTest {
    public static void main(String[] args) {
        Integer[] integers={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> integerArrayList=new ArrayList<Integer>(Arrays.asList(integers));

        System.out.println("elements in the integer list: "+integerArrayList);
        System.out.println("total sum: "+sum(integerArrayList));


        Double[] doubles={1.1,2.2,3.3,4.4,5.5};
        ArrayList<Double> doubleArrayList=new ArrayList<Double>(Arrays.asList(doubles));

        System.out.println("elements in the double list: "+doubleArrayList);
        System.out.println("total sum: "+sum(doubleArrayList));


        Number[] numbers={1,2,3.4,4.9,5};
        ArrayList<Number> numberArrayList=new ArrayList<Number>(Arrays.asList(numbers));

        System.out.println("elements in the integer list: "+numberArrayList);
        System.out.println("total sum: "+sum(numberArrayList));
    }

    public static double sum(ArrayList<? extends Number>arrayList)
    {
        double total=0.0;
        for(var item:arrayList)
        {
            total+= item.doubleValue();
        }
        return total;
    }
}
