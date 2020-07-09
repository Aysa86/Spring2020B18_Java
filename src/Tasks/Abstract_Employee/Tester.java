package Tasks.Abstract_Employee;

public class Tester extends Employee{

    public  Tester(String name, int age, char gender, double salary, String jobTitle){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(name+" is working");
    }


}
