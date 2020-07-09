package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setCatInfo("British", "White", 1, "Fluffy");

        System.out.println(cat1); // Fluffy, breed is British, the color is White, 1 years old

        Cat cat2 = new Cat();
        cat2.setCatInfo("Scottish", "Beige", 2, "Bobo");

        Cat cat3 = new Cat();
        cat3.setCatInfo("Calico", "Black", 5, "Cinnamon");

        ArrayList<Cat> catList = new ArrayList<>();
        catList.addAll(Arrays.asList(cat1, cat2, cat3));

        for(int a = 0; a < catList.size(); a++){
            System.out.println(catList.get(a));
        }
        System.out.println("===============================================================");

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();
        System.out.println("=================================================================");
        cat1.eat("fish");
        cat2.eat("treats");
        cat3.eat("healthy food");
        System.out.println("================================================================");
        cat1.drink("milk");
        cat2.drink("water");
        cat3.drink("warm milk");


    }
}
