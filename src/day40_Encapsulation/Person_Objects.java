package day40_Encapsulation;

public class Person_Objects {
    public static void main(String[] args) {

      Person name = new Person("Aysa");

        System.out.println(name.name);

        name.setSSN(12345);
        System.out.println("Aysa's SSN: "+name.getSSN());

        name.setID(987654);
        System.out.println("Aysa's ID: "+name.getID());



    }
}
