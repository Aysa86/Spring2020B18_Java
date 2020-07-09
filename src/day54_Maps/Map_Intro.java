package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {
    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Aysa", 100000.0);
        employeeInfo.put("Eugene", 120000.0);

        System.out.println(employeeInfo); // {Aysa=100000.0, Eugene=120000.0}
        System.out.println(employeeInfo.size());


        System.out.println(employeeInfo.get("Aysa")); // 100000.0


        employeeInfo.remove("Eugene");
        System.out.println(employeeInfo); // {Aysa=100000.0}, size is 1








    }
}
