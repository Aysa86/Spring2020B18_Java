package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class dogObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.setDogInfo("Husky", "Medium", 2, "Grey","Fluffy");

        /*dog1.breed = "Husky";
        dog1.size = "Medium";                          ^^
        dog1.color = "Grey";             the same with ||
        dog1.name = "Fluffy";
        dog1.age = 2;
        */

        /*
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        System.out.println(dog1.age);*/

        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay", "big", 1, "Brown", "Ghost");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle", "small", 4, "white", "Lucky");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);



        System.out.println("=================================================");

        Dog dog4 = new Dog();
        dog4.setDogInfo("Pomeranian", "small", 3, "black", "Lil");

        Dog dog5 = new Dog();
        dog5.setDogInfo("Husky", "Extra big", 6, "white", "Bella");

        ArrayList<Dog> puppies = new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1, dog2, dog3));
        puppies.addAll(Arrays.asList(dog4, dog5));

        for(int a = 0; a < puppies.size(); a++){
            Dog eachDog =  puppies.get(a);
            System.out.println(eachDog);
        }
        System.out.println("===============================================");

        puppies.removeIf(p -> p.age > 2);

        for(int a = 0; a < puppies.size(); a++){
            Dog eachDog =  puppies.get(a);
            System.out.println(eachDog);
        }

    }
}
