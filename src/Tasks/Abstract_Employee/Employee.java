package Tasks.Abstract_Employee;

public abstract class Employee {
    /*
     1. create an abstract class called Employee
                attributes: name, age, gender, salary, jobtitle
                methods:
                        abstract methods: work()
                        instance method: toString()
        2. create two sub classes of the Employee:
                                    1. Tester
                                    2. Developer
                    each class MUST have constructors to initialize the attributes
     */

   public  String name;
   public int age;
   public char gender;
   public double salary;
   public String jobTitle;

   public abstract void work();

   public String toString(){
     return "Name: "+name+", job title: "+jobTitle+", gender: "+gender+", age: "+gender+", salary: "+salary;
   }

}
