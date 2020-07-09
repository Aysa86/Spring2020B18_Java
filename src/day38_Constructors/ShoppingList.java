package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    /*
    create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
     */
    public static void main(String[] args) {

        Item item1 = new Item("Bag", 500, 1);
        System.out.println(item1.calCost());


        Item item2 = new Item("Scarf", 200, 1);
        Item item3 = new Item("Sneakers", 50, 1);
        Item item4 = new Item("iPhone", 1000, 1);
        Item item5 = new Item("AirPods", 250, 1);

        ArrayList<Item> list = new ArrayList<>(Arrays.asList(item1, item2, item3, item4, item5));

        double total = 0;

        /*for(Item each : list){
            total+=each.calCost();
            //System.out.println(each);                       SOLUTION 1
        }
        System.out.println("Total price: $"+total);*/


        for(int a = 0; a < list.size(); a++){
           total+=list.get(a).calCost();
        }

        System.out.println("Total price: $"+total);






        }




    }



