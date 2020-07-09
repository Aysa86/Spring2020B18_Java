package day41_Inheritance.Task01;

public class Employee {
    /*
    Task:
	create  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString
	create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
	create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
     create subclass of employee name it business analyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     */
    public  double salary;
    public String name;
    public long ID;
    public String jobTitle;
    public char gender;


    public String toString(){
        return "Name: "+name+", job title: "+jobTitle+", salary: "+salary+", ID "+ID+", gender: "+gender;
    }
}
