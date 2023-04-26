public class ReflectionDemo {
    public static void main(String[] args) {
        Class object=Dog.class;

        String name= object.getName();
        System.out.println("Class name "+name);

        Class superClassName=object.getSuperclass();
        System.out.println("name of the super class "+superClassName.getName());

        Class[] interfaces= object.getInterfaces();
        for(var item:interfaces)
        {
            System.out.println("interface name is: "+item.getName());
        }
    }
}
