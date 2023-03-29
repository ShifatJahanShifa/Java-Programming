import java.util.Scanner;

public class FileDemonstrationTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        FileDemonstration fileDemonstration=new FileDemonstration();
        fileDemonstration.analyzePath(input.nextLine());
    }
}
