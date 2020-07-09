package OfficeHours.Practice_05_06_2020;

public class TesterObject {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Aysa", "SDET", 110000, 12345);
        System.out.println(tester1);

        Tester tester2 = new Tester();
        tester2.setInfo("Dzhalaeva", "Developer", 120000, 54321);
        System.out.println(tester2);

        Tester tester3 = new Tester();
        tester3.setInfo("Eugene", "SDET", 110000, 67890);
        System.out.println(tester3);

        tester2.smokeTesting();//
        tester3.smokeTesting();//         NO NEED OF SOUT

        tester1.creatingTicket();//





    }
}
