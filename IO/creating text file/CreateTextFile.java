import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    private Formatter output;

    public void openFile()
    {
        try {
            output = new Formatter("clients.txt");
        }
        catch (SecurityException securityException)
        {
            System.err.println("you don't have right to write in the file");
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("no such file found");
            System.exit(1);
        }
    }

    public void addRecords()
    {
        AccountRecord accountRecord=new AccountRecord();
        Scanner input=new Scanner(System.in);

        System.out.println("to terminate input, type end of file indicator when you are prompt to enter input");
        System.out.println("type <ctrl>+d on terminal to stop taking input\n");

        System.out.print("enter account number (>0), first name, last name, balance\n? ");

        while(input.hasNext())
        {
            try{
                accountRecord.setAccountNumber(input.nextInt());
                accountRecord.setFirstName(input.next());
                accountRecord.setLastName(input.next());
                accountRecord.setBalance(input.nextDouble());

                if(accountRecord.getAccountNumber()>0)
                {
                    output.format("%d %s %s %.2f\n",accountRecord.getAccountNumber(),accountRecord.getFirstName(),
                            accountRecord.getLastName(),accountRecord.getBalance());
                }
                else
                {
                    System.out.println("account number must be greater than 0");
                }
            }
            catch (FormatterClosedException formatterClosedException)
            {
                System.err.println("can't format the file");
                return;
            }
            catch (NoSuchElementException noSuchElementException)
            {
                System.err.println("invalid input. try again");
                input.nextLine();
            }

            System.out.print("enter account number (>0), first name, last name, balance\n? ");
        }
    }

    public void closeFile()
    {
        if(output!=null)
        {
            output.close();
        }
    }
}
