import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {
    private MenuOption accountType;
    private Scanner input;
    private MenuOption[] choices={MenuOption.ZERO_BALANCE,MenuOption.CREDIT_BALANCE,
                                  MenuOption.DEBIT_BALANCE,MenuOption.END};

    private void readRecords()
    {
        AccountRecord accountRecord=new AccountRecord();

        try {
            input = new Scanner(new File("clients.txt"));

            while (input.hasNext())
            {
                accountRecord.setAccountNumber(input.nextInt());
                accountRecord.setFirstName(input.next());
                accountRecord.setLastName(input.next());
                accountRecord.setBalance(input.nextDouble());

                if(shouldDisplay(accountRecord.getBalance()))
                {
                    System.out.printf("%-10d%-12s%-12s%10.2f\n",accountRecord.getAccountNumber(),accountRecord.getFirstName(),
                    accountRecord.getLastName(),accountRecord.getBalance());
                }
            }
        }
        catch (NoSuchElementException noSuchElementException)
        {
            System.err.println("input is not properly formatted");
            input.close();
            System.exit(1);
        }
        catch(IllegalStateException illegalStateException)
        {
            System.err.println("can't read from file");
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("file not found");
            System.exit(1);
        }
        finally {
            if(input!=null)
                input.close();
        }
    }

    private boolean shouldDisplay(double balance)
    {
        if((accountType==MenuOption.ZERO_BALANCE) && balance==0)
            return true;
        else if((accountType==MenuOption.CREDIT_BALANCE) && balance<0)
            return true;
        else if((accountType==MenuOption.DEBIT_BALANCE) && balance>0)
            return true;

        return false;
    }

    private MenuOption getRequest()
    {
        Scanner input2=new Scanner(System.in);
        int request=-1;

        System.out.println("Enter requests: ");
        System.out.println("1. List accounts with zero balances");
        System.out.println("2. List accounts with credit balances");
        System.out.println("3. List accounts with debit balances");
        System.out.print("4. End\n? ");

        try {

            do {
                request = input2.nextInt();
            } while (request < 1 || request > 4);
        }
        catch (NoSuchElementException noSuchElementException)
        {
            System.err.println("invalid input");
            System.exit(1);
        }

        return choices[request-1];
    }

    public void processRequests()
    {
        accountType=getRequest();

        while (accountType!=MenuOption.END)
        {
            switch (accountType)
            {
                case ZERO_BALANCE:
                    System.out.println("accounts with zero balance");
                    break;

                case CREDIT_BALANCE:
                    System.out.println("accounts with credit balance");
                    break;

                case DEBIT_BALANCE:
                    System.out.println("accounts with debit balance");
                    break;

            }

            readRecords();
            accountType=getRequest();
        }
    }
}
