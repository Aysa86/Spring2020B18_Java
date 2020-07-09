package OfficeHours.Practice_05_13_2020;

public class Student {
    //static String name;
    String name;
    long ID;
    static String schoolName = "Cybertek";

    public String toString() {
        return "Name: " + name + ", ID: " + ID+", school name: "+schoolName;
    }
}
    class StudentObjects{
        public static void main(String[] args) {
           Student student1 = new Student();
           student1.name = "Aysa";
           student1.ID = 123;

           Student student2 = new Student();
           student2.name = "Eugene";
           student2.ID = 456;

            System.out.println(student1);
            System.out.println(student2);

// if name will be static in a print statement it's gonna be "Eugene" for both print statements

        }
    }





