package day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {
    public static void main(String[] args) {

        LinkedHashMap<String, String>  facebook = new LinkedHashMap<>();
        facebook.put("Aysa", "Aysa86");
        facebook.put("Eugene", "Aysa86");
        facebook.put("Test1", "password2");
        facebook.put("Test1", "password1"); // last one will be in the map
        facebook.put("Test2", "password2");
        facebook.put("Test3", "password3");

        System.out.println(facebook);

        System.out.println("===============================================");

        for (String eachKey : facebook.keySet() ) {
            System.out.println(eachKey); // Aysa, Eugene, Test1, Test2, Test3

        }
        List<String> usernames = new ArrayList<>(facebook.keySet());
        System.out.println(usernames); // [Aysa, Eugene, Test1, Test2, Test3]

        System.out.println("===============================================");


        for (String eachValue : facebook.values()){
            System.out.println(eachValue);
        }

        List<String> password = new ArrayList<>(facebook.values());
        System.out.println(password); // [Aysa86, Aysa86, password1, password2, password3]


        System.out.println("==================================================");

/*
create a map that conatins student names and Score
                                        String    Integer
                                    put 5 students names and thier scores
            write a program that can print out the names of the students who scored less than 90

 */
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Student1", 80);
        students.put("Student2", 140);
        students.put("Student3", 90);
        students.put("Student4", 150);
        students.put("Student5", 100);

        LinkedHashMap<String, Integer> badStudent = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();

        for (String each : students.keySet()){
            int eachValue = students.get(each);
            if(eachValue < 90){
                badStudent.put(each, eachValue);
            }else{
                goodStudents.put(each, eachValue);
            }
        }

        System.out.println(goodStudents); // {Student2=140, Student3=90, Student4=150, Student5=100}
        System.out.println(badStudent); // {Student1=80}






    }
}
