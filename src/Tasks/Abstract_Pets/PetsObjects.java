package Tasks.Abstract_Pets;

public class PetsObjects {
    public static void main(String[] args) {

        Dog dog = new Dog("Fluffy", 2, "Black", "Poodle", 'M');
        dog.eat();
        dog.sleep();
        dog.speak();
        System.out.println(dog);

        Cat cat = new Cat("Lima", 1, "White", "British", 'F');
        System.out.println(cat);
        cat.eat();
        cat.sleep();

        Tiger tiger = new Tiger("Loo", 4, "Yellow", "Tiger", 'M');
        System.out.println(tiger);
        tiger.eat();
        tiger.sleep();

    }
}
