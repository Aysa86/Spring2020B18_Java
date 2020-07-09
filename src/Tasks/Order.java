package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    /*
     create a class called Order
            create five objects of the pizza
            create an arraylist of pizza and add those 5 objects into it
            calculate the total price of the order (use for each loop)
     */
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza("small", 1, 2);
        Pizza pizza2 = new Pizza("large", 3, 2);
        Pizza pizza3 = new Pizza("large", 1, 1);
        Pizza pizza4 = new Pizza("Medium", 2, 3);
        Pizza pizza5 = new Pizza("Medium", 2, 1);

        ArrayList<Pizza> list = new ArrayList<>(Arrays.asList(pizza1, pizza2, pizza3, pizza4, pizza5));

       // System.out.println(list.size());
        double total=0;

        for(Pizza each : list){
            total+=each.calCost();
            System.out.println(each);
        }
        System.out.println("Order Total price: $"+total);

    }
}