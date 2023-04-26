import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class FieldDemo {
    public static void main(String[] args) {
        Student student=new Student();
        Class object=student.getClass();

        Field[] fields= object.getDeclaredFields();
        fields[1].setAccessible(true);

        System.out.printf("%-10s%-10s\n","modifier","Field name");
        for(var item:fields)
        {
            int mod= item.getModifiers();
            String modifier= Modifier.toString(mod);
            System.out.printf("%-10s%-10s\n",modifier,item.getName());
        }

        Scanner input=new Scanner(System.in);
        System.out.println("\ninput name and roll number of the student");
        for(var item:fields)
        {
            try {
                item.set(student, input.nextLine());
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }

        System.out.println("the value of the fields: ");
        for(var item:fields) {
            try {
                System.out.println(item.getName() + ": " + item.get(student));
            } catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
            }
        }
    }
}
