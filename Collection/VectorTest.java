import java.util.NoSuchElementException;
import java.util.Vector;

public class VectorTest {
    private static final String colors[]={"red","white","blue"};

    public VectorTest()
    {
        Vector<String>vector=new Vector<String>();
        printVector(vector);

        for(String color:colors)
        {
            vector.add(color);
        }
        System.out.println("");

        printVector(vector);

        System.out.println("");

        try{
            System.out.printf("First element: %s\n",vector.firstElement());
            System.out.printf("Last element: %s\n",vector.lastElement());
        }
        catch (NoSuchElementException exception)
        {
            exception.printStackTrace();
        }

        if(vector.contains("red"))
        {
            System.out.printf("\n\"red\" found at %d\n",vector.indexOf("red"));
        }
        else
        {
            System.out.println("\n red not found");
        }

        vector.remove("red");
        System.out.println("\nred has been removed");

        printVector(vector);

        if(vector.contains("red"))
        {
            System.out.printf("\n\"red\" found at %d\n",vector.indexOf("red"));
        }
        else
        {
            System.out.println("\n red not found");
        }

        System.out.printf("\nsize %d\ncapacity %d\n",vector.size(),vector.capacity());
    }

    private void printVector(Vector<String>vectorToOutput)
    {
        if(vectorToOutput.isEmpty())
            System.out.println("vector is empty");
        else
        {
            System.out.println("\nvector contains");

            for(String color:vectorToOutput)
            {
                System.out.print(color+" ");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        new VectorTest();
    }
}
