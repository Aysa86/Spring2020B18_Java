package day49P_Polymorphisim;
class Animal{

}
class Dog extends Animal{

}
class Cat extends Animal{

}
public class Polymorphism_Intro {
    public static void main(String[] args) {

        Animal obj = new Animal();// doesn't compile when we have interface
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();

        // Dog obj4 = new Cat();
        Dog obj5 = new Dog();
        Cat obj6 = new Cat();

        Animal[] animalShow = {obj2, obj3, obj5, obj6};




    }
}
