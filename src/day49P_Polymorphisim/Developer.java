package day49P_Polymorphisim;

public class Developer extends Employee {
    // 3. create class named Developer that inherits from emplyee

    public void work() {
        System.out.println(name + " is working as a senior developer");
    }

    public Developer(String name, long id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;


    }
    public String toString(String name, long id, String jobTitle, double salary){
        return "Name: "+name+", id: "+id+", job title: "+jobTitle+", salary: "+salary;
    }

}