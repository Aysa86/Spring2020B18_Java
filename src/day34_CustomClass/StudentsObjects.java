package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentInfo("Aysa", 'F', "Russian", 33, 3.5, true);
       // System.out.println(student1);

        Student student2 = new Student();
        student2.setStudentInfo("Eugene", 'M', "Kalmuk", 33, 3.0, true);
        //System.out.println(student2);

        Student student3 = new Student();
        student3.setStudentInfo("Ekaterina", 'F', "Russian", 30, 2.5, false);
       // System.out.println(student3);

        Student student4 = new Student();
        student4.setStudentInfo("Chingiz", 'M', "Russian", 36, 3.0, false);
        //System.out.println(student4);


        Student[] students = {student1, student2,student3,student4};
                          // we put array into ArrayList=>
        ArrayList<Student> canGraduate = new ArrayList<>(Arrays.asList(students));
        canGraduate.removeIf(p->p.gpa <= 3.0);

        System.out.println(canGraduate.size()); //1

        for(int i = 0; i < canGraduate.size(); i++){
        Student each = canGraduate.get(i);
            System.out.println(each.name+" can graduate");
        }
        System.out.println("==============================================================");

        ArrayList<Student> canNotGraduate = new ArrayList<>(Arrays.asList(students));
        canNotGraduate.removeIf(p -> p.gpa > 3.0);

        System.out.println(canNotGraduate.size());

        for(Student each : canNotGraduate){
            System.out.println(each.name+" can't graduate");
        }






    }
}
