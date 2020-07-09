package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {

    Carpet [] carpets = {new Carpet(), new Carpet(), new  Carpet(), new Carpet(), new Carpet()};

       carpets[0].customOrder(5.5, 8.5, 15, true);
        System.out.println(carpets[0]);

       carpets[1].customOrder(2.5, 2.5,10,false);
        System.out.println(carpets[1]);

       carpets[2].customOrder(10, 10,20,true);
        System.out.println(carpets[2]);

        carpets[3].customOrder(15,15,30,false);
        System.out.println(carpets[3]);

        carpets[4].customOrder(40,40.5, 40, true);
        System.out.println(carpets[4]);


        ArrayList<Carpet> persianCarpets = new ArrayList<>();

        for(Carpet eachCarpet : carpets){
           if(eachCarpet.isPersian){
               persianCarpets.add(eachCarpet);
           }
        }

        System.out.println("There are "+persianCarpets.size()+ " persian carpets");
        System.out.println( persianCarpets.get(0).calcCost()); // 410.0 total price of first carpet

//                                          dobavili vse carpets v novui ArrayList
        ArrayList<Carpet> RegularCarpets = new ArrayList<>(Arrays.asList(carpets));
       // RegularCarpets.removeAll(persianCarpets);// udalili persian, ostalis regular
        RegularCarpets.removeIf(p -> p.isPersian);

        System.out.println("There are "+RegularCarpets.size()+" regular carpets");

        System.out.println(RegularCarpets.get(0).calcCost());//50.0

        for(int i = 0; i < RegularCarpets.size(); i++){
            System.out.println( RegularCarpets.get(i).calcCost()  );
        }

    }
}
