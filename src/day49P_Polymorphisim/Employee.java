package day49P_Polymorphisim;

public abstract class Employee {
    /*
     1. create an abstract class named Employee:
            attributes: name, id, jobTitle, Salary,...
            abstract method: work()
    2. create class named Tester that inherits from emplyee
    3. create class named Developer that inherits from emplyee
    4. create a class named ScrumTeam:
            create an arraylist and store 3 testers and 4 developers

     */
   public  String name;
   public long id;
   public String jobTitle;
   public double salary;

   public abstract void work();

   public String toString(){
      return "Name: "+name+", id: "+id+", job title: "+jobTitle+", salary: "+salary;
   }


}
