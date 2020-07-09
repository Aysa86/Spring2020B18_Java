package day41_Inheritance.Task01;

public class BusinessAnalyst extends Employee {
    /*
    create subclass of employee name it business analyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     */

    public BusinessAnalyst(String name, String jobTitle, double salary, long ID, char gender){
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.gender = gender;
    }

    public void writingRequirements(){
        System.out.println(name+" is writing the requirements for the new project");
    }
    public void gathering(){
        System.out.println(name+" is gathering the requirements for the new project");
    }
}
