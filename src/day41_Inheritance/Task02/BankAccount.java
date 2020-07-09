package day41_Inheritance.Task02;

public class BankAccount {
    /*
    create a class called BankAccount
			variables:  accountNumber, accountHolder, Balance
			methods: deposit, showBalance, toString
	create sub class of BankAccount and name it SavingAccount
			variables: accountNumber, accountHolder, balance, interestRate
			methods: deposit, showBalance
	create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance
     */

  public long accountNumber;
  String accountHolder;
  double balance;


    public void deposit(int amount){
        balance += amount;
    }

    public void showBalance(){
        System.out.println("Available Balance: $"+balance);
    }

    public String toString(){
        return "Name: "+accountHolder+", balance: $"+balance;
    }






}
