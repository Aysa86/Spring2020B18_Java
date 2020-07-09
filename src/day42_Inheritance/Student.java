package day42_Inheritance;

public class Student extends Person{
    /*
    create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
     */
    public static String schoolName = "Cybertek University";
    public long studentID;
    public String clazz;

    public void setStudentInfo(String name, int age, char gender,long studentID, String clazz){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentID = studentID;
        this.clazz = clazz;
    }
    public void attendClass(){
        System.out.println(name+ " attend the class");
    }
    public void code(){
        System.out.println(name+" is coding");
    }
    public String toString(){
        return"School name"+schoolName+"name: "+name+", clazz: "+clazz+", student ID: "+studentID+", age: "+age+", gender: "+
                gender;
    }



}
