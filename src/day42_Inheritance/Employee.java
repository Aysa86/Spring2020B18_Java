package day42_Inheritance;

public class Employee extends Person{
    /*
    create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString
     */

    public double salary;
    public long employeeID;
    public String jobTitle;

    public void setEmployeeInfo(String name, int age, char gender,double salary, long employeeID, String jobTitle){
        this.salary = salary;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void work(){
        System.out.println(name+" is working");
    }
    public String toString(){
        return "Name: "+name+", job title: "+jobTitle+", ID: "+employeeID+", salary: "+salary+
                ", age: "+age+", gender: "+gender;
    }





}
