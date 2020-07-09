package day38_Constructors;

public class DogObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        System.out.println(dog1.name);// unknown
        System.out.println(dog1.breed);// unknown
        System.out.println(dog1.age);// 0

        Dog dog2 = new Dog("Husky");
        System.out.println(dog2.name);// unknown
        System.out.println(dog2.breed);// Husky
        System.out.println(dog2.age);// 0

        Dog dog3 = new Dog("Poodle", 2);
        System.out.println(dog3.name);// unknown
        System.out.println(dog3.breed);// poodle
        System.out.println(dog3.age);// 2

        System.out.println("============================");

        System.out.println(dog1);//Name: unknown, breed: unknown, name: unknown
        System.out.println(dog2);//Name: unknown, breed: Husky, name: unknown
        System.out.println(dog3);//Name: unknown, breed: Poodle, name: unknown

    }
}
