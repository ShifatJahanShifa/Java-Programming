import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    private Scanner input;

    public void openFile()
    {
        try {
            input = new Scanner(new File("clients.txt"));
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("file not found");
            System.exit(1);
        }
    }

    public void readRecords()
    {
        AccountRecord accountRecord=new AccountRecord();
        System.out.printf("%-10s%-12s%-12s%10s\n","Account","First Name","Last Name","Balance");

        while (input.hasNext())
        {
            try{
                accountRecord.setAccountNumber(input.nextInt());
                accountRecord.setFirstName(input.next());
                accountRecord.setLastName(input.next());
                accountRecord.setBalance(input.nextDouble());

                System.out.printf("%-10d%-12s%-12s%10.2f\n",accountRecord.getAccountNumber(),accountRecord.getFirstName(),
                        accountRecord.getLastName(),accountRecord.getBalance());
            }
            catch (NoSuchElementException noSuchElementException)
            {
                System.err.println("invalid input");
                input.close();
                System.exit(1);
            }
            catch (IllegalStateException illegalStateException)
            {
                System.err.println("can't read from file");
                System.exit(1);
            }
        }
    }

    public void closeFile()
    {
        if(input!=null)
        {
            input.close();
        }
    }
}
