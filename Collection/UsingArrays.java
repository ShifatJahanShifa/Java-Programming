import java.util.Arrays;

public class UsingArrays {
    private int intArray[]={1,2,3,4,5,6};
    private double doubleArray[]={8.4,9.3,0.2,7.9,3.4};
    private int filledIntArray[],intArrayCopy[];

    // constructor for initializing array
    public UsingArrays()
    {
        filledIntArray=new int[10];
        intArrayCopy=new int[intArray.length];

        Arrays.fill(filledIntArray,7);
        Arrays.sort(doubleArray);

        // for copying array, using arraycopy method of system
        System.arraycopy(intArray,0,intArrayCopy,0,intArray.length);
    }

    // output value in each array
    public void printArray()
    {
        System.out.println("double array: ");
        for(double doubleValue:doubleArray)
        {
            System.out.printf("%1.1f ", doubleValue);
        }
        System.out.println("");

        System.out.println("int array: ");
        for(int intValue:intArray)
        {
            System.out.printf("%d ", intValue);
        }
        System.out.println("");

        System.out.println("filled int array: ");
        for(int intValue:filledIntArray)
        {
            System.out.printf("%d ", intValue);
        }
        System.out.println("");

        System.out.println("int array copy");
        for(int intValue:intArrayCopy) {
            System.out.printf("%d ", intValue);
        }
        System.out.println("");
    }

    // method for finding a value from an array
    public int searchForInt(int value)
    {
        return Arrays.binarySearch(intArray,value);
    }

    // compare array contents
    public void printEquality()
    {
        boolean ok=Arrays.equals(intArray,intArrayCopy);
        System.out.println("intArray "+(ok ? "==" : "!=")+"intArrayCopy");

        ok=Arrays.equals(intArray,filledIntArray);
        System.out.println("intArray "+(ok ? "==" : "!=")+"filledIntArray");
    }


    public static void main(String[] args) {
        UsingArrays usingArrays=new UsingArrays();

        usingArrays.printArray();
        usingArrays.printEquality();

        int location= usingArrays.searchForInt(5);
        if(location>=0)
            System.out.println("element "+5+" is found at location "+location);
        else
            System.out.println("element 5 was not found in the intArray");

        location= usingArrays.searchForInt(8763);
        if(location>=0)
            System.out.println("element "+8763+" is found at location "+location);
        else
            System.out.println("element 8763 was not found in the intArray");
    }
}
