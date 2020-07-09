package day50_polymorphism;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        int a = 100; // implicit, smaller to larger
        double b = a;
        double c = (double)a; // implicit casting done manually

        Dog dog = new Dog("D", 1, 'M');
        Animal animal1 = dog;  // upcasting, done implicitly
        Animal animal2 = (Animal)dog; // upcasting manually

        Cat cat = new Cat("B", 1, 'F');
       // Dog dog2 = (Dog)cat;  IS A relationship MUST be
        Animal animal3 = (Animal) cat;

        System.out.println("=======================================");

        double d = 10;
        int e = (int)d;// explicit casting, done manually


        Animal animal4 = new Dog("N", 1, 'M');
        Dog dog3 = (Dog)animal4;// explicitly done, MUST be done manually, downcasting


        Animal animal5 = new Cat("W", 3, 'M');
        Cat cat2 = (Cat)animal5;// downcasting, from super to sub

        System.out.println("=============================================");

        Animal animal6 = new Dog("List", 1, 'F');
       //  animal6.bark(); we cant call it directly
        
        // first way:
        Dog dog4 = (Dog)animal6;// we have to downcast it
        dog4.bark();
        Dog dog5 = (Dog)(animal6);
        System.out.println(dog5.dogName);

        // second way:
        ((Dog)animal6).bark(); // put it in printeces
        System.out.println( ((Dog)animal6).dogName);











    }
}