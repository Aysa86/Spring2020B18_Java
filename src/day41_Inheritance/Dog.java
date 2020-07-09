package day41_Inheritance;

public class Dog extends Animal {// 3 variables and 2 methods from Animal class are here, compiler know it

    public void bark(){
        System.out.println(name+" is barking");
    }


    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        System.out.println(dog1.name); // Lucy

        dog1.move();// Lucy is moving
        dog1.eat();// Lucy is eating
        dog1.bark();// Lucy is barking

    }
}