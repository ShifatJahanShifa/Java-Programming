public class Dog implements Animals,Sound{
    @Override
    public void display() {
        System.out.println("this is a "+getClass().getName());
    }

    @Override
    public void makeSound() {
        System.out.println("makes sound as:: bark! bark! ");
    }
}
