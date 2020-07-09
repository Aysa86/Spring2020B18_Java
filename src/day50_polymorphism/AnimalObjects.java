package day50_polymorphism;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal cat = new Cat("Lily", 2, 'F');



        Dog dog1 = new Dog("Lucy", 3, 'F');
        dog1.bark();
        System.out.println(dog1.dogName);


        Animal dog2 = new Dog("Ball", 1, 'M');
       // System.out.println(dog2.dogName);
       // dog2.bark(); reference decides what is accessable what can be called
       // we dont have these 2 in Animal class
        dog2.eat(); // this method is overridden, that's why it gives "Ball is eating"
        dog2.sleep();
        dog2.methodA();//Animal Class


        Animal animal1 = new Cat("Mouse", 4, 'M');

        boolean isDog = animal1 instanceof Cat;
        System.out.println(isDog);// true

        Dog d1 = new Dog("Flash", 2, 'M');
       // boolean r1 = d1 instanceof Cat;// no IS A relation between Cat and Dog

        Animal d2 = new Dog("Key", 5, 'm');
        boolean r2 = d2 instanceof Cat; // IS A relations between Animal and Cat

        Animal animal2 = new Cat("Anna", 1, 'F');
        boolean r3 = animal2 instanceof Animal; // true
        System.out.println(r3);
    }
}
