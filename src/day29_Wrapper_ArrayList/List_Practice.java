package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
              groceryList.add("milk");// size: 1
              groceryList.add("coffee");// size: 2
              groceryList.add("bread"); // size: 3
              groceryList.add("toilet paper"); // size: 4
              groceryList.add("eggs");// size: 5

        /*System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(1));
        System.out.println(groceryList.get(2));
        System.out.println(groceryList.get(3));*/

        for(int i = 0; i <= groceryList.size()-1; i++){// i : 0,1,2,3,4
            System.out.println(groceryList.get(i));
        }
        System.out.println("====================================");
        for(String each : groceryList){
            System.out.println(each);
        }

        // size():

        int size = groceryList.size();
        System.out.println(size);// size : 5

        int lastIndex = groceryList.size()-1;

    }
}
