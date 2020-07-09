package day42_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {


    /*
    create a class called school:
					create 3 objects of student and set thier info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
     */

        Student student1 = new Student();
        student1.setStudentInfo("Aysa", 33, 'F', 345, "online 11");

        Student student2 = new Student();
        student2.setStudentInfo("Eugene", 33, 'M', 123, "Harvard");

        Student student3 = new Student();
        student3.setStudentInfo("Ekaterina", 30, 'F', 687, "World");

        ArrayList<Student> list = new ArrayList<>(Arrays.asList(student1, student2, student3));

        for (Student each : list ){
            //System.out.println(each);
            System.out.println("Name: "+each.name+", ID: "+each.studentID);
        }
    }
}