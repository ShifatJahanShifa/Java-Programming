import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodDemo {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        Class object=vehicle.getClass();

        Method[] methods= object.getDeclaredMethods();

        for (var item:methods)
        {
            System.out.println("name of the method: "+item.getName());
            System.out.println("access modifier of the method: "+ Modifier.toString(item.getModifiers()));
            System.out.println("return type of the method: "+item.getReturnType());
            System.out.println();
        }
    }
}
