package day41_Inheritance.Task02;

public class AccountObjects {
    public static void main(String[] args) {

        CheckingAccount checking = new CheckingAccount();
        checking.accountHolder = "Aysa Dzhalaeva";

        System.out.println(checking);

        checking.deposit(10000);
        checking.showBalance();
        checking.withdraw(1000);
        checking.showBalance();
        System.out.println(checking);

        System.out.println("====================================");

        SavingAccount saving = new SavingAccount();
        System.out.println(saving.interestRate);

        saving.accountHolder = "Ekaterina Dzhalaeva";
        saving.deposit(20000);
        System.out.println(saving);


    }

}
