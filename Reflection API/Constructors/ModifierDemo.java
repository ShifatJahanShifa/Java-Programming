import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ModifierDemo {
    public static void main(String[] args) {
        Person person=new Person();
        Class object=person.getClass();

        Constructor[] constructors= object.getDeclaredConstructors();

        System.out.println("constructors of the class "+object.getName()+"\n");

        for (var item:constructors)
        {
            System.out.println("constructor name: "+item.getName());
            System.out.println("access modifier of this constructor: "+ Modifier.toString(item.getModifiers()));
            System.out.println("count of the parameter of this constructor: "+item.getParameterCount());

            if(item.getParameterCount()>0)
            {
                Class[] parameters= item.getParameterTypes();
                System.out.println("constructor parameters types: ");
                for (var type:parameters)
                {
                    System.out.print(type.getName()+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
