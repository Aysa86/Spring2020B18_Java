package day49P_Polymorphisim;

// 2. create class named Tester that inherits from emplyee

public class Tester extends Employee{
    public Tester(String name, long id, String jobTitle, double salary){
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name+" is working as a SDET");
    }
    public String toString(String name, long id, String jobTitle, double salary){
        return "Name: "+name+", id: "+id+", job title: "+jobTitle+", salary: "+salary;
    }

}
