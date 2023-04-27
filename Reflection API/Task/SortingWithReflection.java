import java.util.*;

public class SortingWithReflection {
    public static void main(String[] args) {
        ObjectFeature objectFeature1=new ObjectFeature("Ishita",17,"India","HSC");
        ObjectFeature objectFeature2=new ObjectFeature("Rini",21,"Bangladesh","SecondYear");
        ObjectFeature objectFeature3=new ObjectFeature("Allen",23,"Russia","MA");
        ObjectFeature objectFeature4=new ObjectFeature("Jones",17,"Canada","BSc.");

        List<ObjectFeature> list=new ArrayList<>();
        list.add(objectFeature1);
        list.add(objectFeature2);
        list.add(objectFeature3);
        list.add(objectFeature4);

        System.out.println("Unsorted list elements: ");
        for (var item:list)
        {
            System.out.println(item.name+" "+item.age+" "+item.country+" "+item.educationalQualification);
        }

        Collections.sort(list, new ObjectComparator());

        System.out.println("\nSorted list elements: ");
        for (var item:list)
        {
            System.out.println(item.name+" "+item.age+" "+item.country+" "+item.educationalQualification);
        }
    }
}
