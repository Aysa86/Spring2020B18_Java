package day41_Inheritance;

public class BankOfAmerica {
    public static void main(String[] args) {

        BankAccount Aysa = new BankAccount("Aysa", "Dzhalaeva");
        System.out.println(Aysa.getAccountHolder());

        System.out.println(Aysa.getBalance());
        Aysa.availableBalance();
        Aysa.depositing(100);
        Aysa.availableBalance();
        Aysa.withdrawing(20);
        Aysa.availableBalance();

        System.out.println(Aysa);

    }
}
