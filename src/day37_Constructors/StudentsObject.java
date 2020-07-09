package day37_Constructors;



public class StudentsObject {

    public static void main(String[] args) {

        Students student1 = new Students("Aysa", 33, 'F', "Cybertek");
        //student1.setInfo("Aysa", 33, 'F', "Cybertek");
        System.out.println(student1);

        Students student2 = new Students("Eugene", 33, 'M', "Temple");
        System.out.println(student2);
    }
}
