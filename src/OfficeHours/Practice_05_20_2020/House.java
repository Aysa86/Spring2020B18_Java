package OfficeHours.Practice_05_20_2020;

public class House { // House HAS A RELATIONS with Cat, Dog, Bunny classes ==> House has a cat, dog, bunny
    public static void main(String[] args) {

       Dog dog1 = new Dog("Lucy", 2, "White", "Medium", "Husky");
      // dog1.setInfo("Lucy", 2, "White", "Medium", "Husky");
        System.out.println(dog1);

       Dog dog2 = new Dog("Ajdar",6,"white","large","Alabai");
        System.out.println(dog2);

        dog1.bark();

        System.out.println("=================================================================");

        Cat cat1 = new Cat("Fluffy", 1, "grey", "little", "British");
        //cat1.setInfo("Fluffy", 1, "grey", "little", "British");
        System.out.println(cat1);
        cat1.scratch("sofa");

        System.out.println("===================================================================");
        Bunny bunny1 = new Bunny("Piper", 2, "grey", "medium", "bunny");
       //  bunny1.setInfo("Piper", 2, "grey", "medium", "bunny");
        System.out.println(bunny1);
        bunny1.dig();
        bunny1.eat("carrot");


    }
}
