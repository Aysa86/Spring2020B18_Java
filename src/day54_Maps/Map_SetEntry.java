package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_SetEntry {
    public static void main(String[] args) {

        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        countries.put("Russia", "Moscow");
        countries.put("United Kingdom", "London");
        countries.put("USA", "Washington DC");
        countries.put("France", "Paris");
        countries.put("Italy", "Roma");


        for (Map.Entry<String, String > each  : countries.entrySet()){

           System.out.println("Country name: "+each.getKey() + ", capital is: "+ each.getValue());
        }

        String input = "russia";

        for (Map.Entry<String, String> each1 : countries.entrySet()){
            String countryName = each1.getKey();
            String cityName = each1.getValue();
            if(input.equalsIgnoreCase(countryName)){
                System.out.println(cityName); // Moscow
            }
        }



    }
}
