package OfficeHours.Practice_05_06_2020;

public class Tester {

    String name;
    String jobTitle;
    double salary;
    long employeeID;

    public void setInfo(String name, String jobTitle, double salary,long employeeID ){
        this.name = name; // user given argument name is assigned to instance variable name
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    public String toString(){
        return "Name: "+name+", job title: "+jobTitle+", salary: $"+salary+", employee ID: "+employeeID;
    }
    public void smokeTesting(){
        System.out.println(name+" is doing smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating a ticket on Jira");
    }




}



