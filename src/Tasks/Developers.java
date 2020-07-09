package Tasks;

public class Developers {
    /*
    create a class called Developers
			Attributes:
				name, employeeId, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(), fixingBugs()
     */
    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setDevelopersInfo(String name, long employeeID, String jobTitle, double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void coding(String code){
        System.out.println(name+" is working on "+code);
    }
    public void fixingBugs(String bug){
        System.out.println(name+" is fixing "+bug);
    }

    public String toString(){
        return "Name is "+name+", employee ID is "+employeeID+", job title is "+jobTitle+", salary is "+salary;
    }




}
