package OfficeHours.Practice_05_13_2020;

public class InstanceTest {
    public static void main(String[] args) {

        Instances obj1 = new Instances();
        obj1.name = "Aysa";

        Instances obj2 = new Instances();// each objects have it's own copy, that's why "null"


        System.out.println(obj1.name);// Aysa
        System.out.println(obj2.name);// null


        obj1.printName(); // "Name is: Aysa";
        obj2.printName();//"Name is: null";


    }

}
    class InstanceBlock{
        public static void main(String[] args) {

            Instances object1 = new Instances();
            System.out.println(object1.name); // Muhtar


        }
    }






