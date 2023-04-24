public class GenInterfaceDemo {
    public static void main(String[] args) {
        Integer[] integers={3,2,6,8,6};
        Character[] characters={'b','r','p','w'};

        MyClass<Integer>integerMyClass=new MyClass<Integer>(integers);
        MyClass<Character>characterMyClass =new MyClass<Character>(characters);

        System.out.println("min value in integerMyClass = "+integerMyClass.min());
        System.out.println("max value in integerMyClass = "+integerMyClass.max());

        System.out.println("min value in characterMyClass = "+characterMyClass.min());
        System.out.println("max value in characterMyClass = "+characterMyClass.max());
    }
}
