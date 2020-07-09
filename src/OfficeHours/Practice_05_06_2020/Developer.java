package OfficeHours.Practice_05_06_2020;

public class Developer {
    /*
    create a class called Developers
               Attributes:
               name, employeeID, JobTitle, Salary

               Actions:
               setDeveloperInfo(), coding(), fixingBugs()
     */

    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setInfo(String name, String jobTitle, double salary,long employeeID ){
        this.name = name; // user given argument name is assigned to instance variable name
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    public String toString(){
        return "Name: "+name+", job title: "+jobTitle+", salary: $"+salary+", employee ID: "+employeeID;
    }

    public void coding(){
        System.out.println(name+" coding a program");
    }
    public void fixingBugs(){
        System.out.println(name+" fixing bug in the written program");
    }

}
