package day41_Inheritance;

public class BankAccount {
     /*
    WarmUp tasks:
    create costum class called BankAccount for Bank of America' bank accounts:
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and fullName
                    (DO NOT USE SHORTCUT)
            action:
                    depositing
                    withdrawing
                    availablebalance
                    toString: returns the full name and balance
 */
  public static String bankName = "Bank of America";
    String lastName;
    String firstName;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountHolder = firstName+" "+lastName;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String firstName, String lastName){
        this.accountHolder = firstName+" "+lastName;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void depositing(int amount){
        setBalance(amount);
        // balance+=amount;
    }
    public void withdrawing(int amount){
        balance-=amount;
        // setBalance(balance-amount);
    }
    public void availableBalance(){
        //System.out.println("Available balance: "+balance);
        System.out.println("Available balance: "+getBalance());
    }
    public String toString(){
        return "Full name: "+getAccountHolder()+", balance: "+getBalance();
    }



}
