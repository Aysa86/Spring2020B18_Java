package day39_AccessModifiers;

public class Employee {
    /*
    create a class called Employee:
                instance variables:
                        name, jobTitle, ID, salary
                add a constructor that can initialize name of employee
                add a constructor that can initialize name, jobTitle of the employee
                            (apply constructor call to initialize the name)
                add a constructor that can initialize name, jobTitle, ID of the employee
                            (apply constructor call to initialize the name and jobTitle)
                add a constructor that can initialize name, jobTitle, ID, salary of employee
                            (apply constructor call to initialize the name, jobTitle, ID)
                add toString method
     */
    static String companyName = "Bank of America";
    String name;
    String jobTitle;
    long ID;
    double salary;

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, String jobTitle){
        this(name);
        this.jobTitle = jobTitle;
    }
    public Employee(String name, String jobTitle, long ID){
        this(name, jobTitle);
        this.ID = ID;
    }
    public Employee(String name, String jobTitle, long ID, double salary){
        this(name, jobTitle, ID);
        this.salary = salary;
    }

    public String toString(){
        return "Company name: "+companyName+", name: "+name+", job title: "+jobTitle+", ID: "+ID+", salary: "+salary;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Aysa");
        System.out.println(employee1);

        Employee employee2 = new Employee("Aysa", "SDET");
        System.out.println(employee2);

        Employee employee3 = new Employee("Aysa", "SDET", 123);
        System.out.println(employee3);

        Employee employee4 = new Employee("Aysa", "SDET", 123, 120000);
        System.out.println(employee4);




    }



}
