package day35_Static;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aysa", 1234, 3.0);
        System.out.println(student1);//Name: Aysa, School name: Cybertek

        Student student2 = new Student();
        student2.name = "Eugene";
        System.out.println(student2);

        Student.printSchoolName();//School name is Cybertek

        




    }
}
