package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;


public class Map_Practice1 {
    public static void main(String[] args) {

        LinkedHashMap<String, LocalDate> classmates = new LinkedHashMap<>();
        classmates.put("Eugene", LocalDate.of(1986, 8, 21));
        classmates.put("Aysa", LocalDate.of(1986, 12, 22));
        classmates.put("Tina", LocalDate.of(1987, 5, 2));
        classmates.put("Doug", LocalDate.of(1981,12,15));
        classmates.put("Ekaterina", LocalDate.of(1962, 12, 8));

        System.out.println(classmates);

        classmates.remove("Aysa");
        System.out.println(classmates);

        System.out.println(classmates.get("Ekaterina")); // 1962-12-08

        boolean result1 = classmates.containsKey("Muhtar");
        System.out.println(result1); // false
        System.out.println(classmates.containsKey("Eugene")); // true

       boolean result2 = classmates.containsValue(LocalDate.of(1987, 5, 2));
        System.out.println(result2); // true ==> Tina

        boolean result3 = classmates.isEmpty();
        System.out.println(result3); // false


        classmates.clear();
        System.out.println(classmates); // {}

    }
}
