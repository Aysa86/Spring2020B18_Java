package Tasks.OnlineEducation;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekSchool {
    public static void main(String[] args) {
        /*
        4. create a class named CybertekSchool
            create 5 objects of students and set your classmates' info
            create a list of Cybertek and store all student objects
            iterate the list to display the full information of students
         */
        Student student1 = new Student("Aysa", 33, 10, false);
        Student student2 = new Student("Mimi", 29, 9, true);
        Student student3 = new Student("Mike", 39, 9, true);
        Student student4 = new Student("John", 26, 10, false);
        Student student5 = new Student( "Anna", 25, 9, true);

        ArrayList<Student> list = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5));

        for (Student each : list){
            System.out.println(each);
        }



    }
}
