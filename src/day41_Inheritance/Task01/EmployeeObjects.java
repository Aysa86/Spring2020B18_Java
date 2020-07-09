package day41_Inheritance.Task01;

public class EmployeeObjects {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Aysa", 100000, 123, "SDET", 'F');

        System.out.println(tester1);

        tester1.reportingBug();
        tester1.testing();

        System.out.println("==================================");

        Developer dev1 = new Developer("Eugene", "Senior developer", 120000, 456, 'M');

        System.out.println(dev1);

        dev1.fixingBug();
        dev1.coding();

        System.out.println("==================================");


        BusinessAnalyst ba = new BusinessAnalyst("Ekaterina", "Business analyst", 170000, 659, 'F');

        System.out.println(ba);

        ba.gathering();
        ba.writingRequirements();





    }
}
