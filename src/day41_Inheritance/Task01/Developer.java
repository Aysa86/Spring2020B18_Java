package day41_Inheritance.Task01;

public class Developer extends Employee{

    public Developer(String name, String jobTitle, double salary, long ID, char gender ){
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.gender = gender;
    }

    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }
    public void coding(){
        System.out.println(name+" is coding an application");
    }

}
