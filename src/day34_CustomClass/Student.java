package day34_CustomClass;

public class Student {

    String name;
    char gender;
    String nationality;
    int age;
    double gpa;
    boolean married;

    public void setStudentInfo(String name, char gender, String nationality, int age, double gpa, boolean married){
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.age = age;
        this. gpa = gpa;
        this.married = married;
    }

    public String toString(){
        String result = "Student's name is: "+name+", gender: "+gender+", nationality: "+nationality+", age: "+age+", gpa: "+gpa+
                ", married: "+married;
        return  result;
    }


}
