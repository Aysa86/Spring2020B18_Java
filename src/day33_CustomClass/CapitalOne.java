package day33_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount Aysa = new BankAccount();
        Aysa.accountHolder = "Aysa";
        Aysa.accountNumber = 12345678;

        Aysa.checkingBalance();// 0.0
        Aysa.deposit(1000);
        Aysa.checkingBalance();//1000.0
        Aysa.withDraw(199.5);
        Aysa.checkingBalance();

        System.out.println(Aysa);//Account Holder: Aysa
                                 //Account Number: 12345678     TO STRING METHOD IN BANK ACCOUNT CLASS
                                 //Available Balance: 800.5




    }
}
