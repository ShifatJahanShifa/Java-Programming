public class AccountRecord {
    private int accountNumber;
    private String firstName;
    private String lastName;
    private double balance;

    public AccountRecord()
    {
        this(0,"","",0.0);
    }

    public AccountRecord(int accountNumber,String firstName,String lastName,double balance)
    {
        setAccountNumber(accountNumber);
        setFirstName(firstName);
        setLastName(lastName);
        setBalance(balance);
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return lastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
