package day37_Constructors;

public class CybertekStudents {

    static String schoolName;
    String studentName;
    int groupNumber;
    String batch;

    public CybertekStudents(String studentName, int groupNumber, String batch){
        schoolName = "Cybertek"; // static, common for all students
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }
    public String toString(){
        return "School name: "+schoolName+", name: "+studentName+", batch # "+batch+", group # "+groupNumber;
    }

}


class CObjects{
    public static void main(String[] args) {

        CybertekStudents student1 = new CybertekStudents("Aysa", 11, "Batch 18" );
        System.out.println(student1);

        CybertekStudents student2 = new CybertekStudents("Eugene", 11, "Batch 18");
        System.out.println(student2);

    }





}