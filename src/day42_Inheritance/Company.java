package day42_Inheritance;

public class Company {
    /*
    create a class called company:
					create 3 objects of employee and set thier info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
     */
    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;

    static {
        employee1 = new Employee();
        employee1.setEmployeeInfo("Aysa", 33, 'F', 120000, 123, "SDET");

        employee2 = new Employee();
        employee2.setEmployeeInfo("Eugene", 33, 'M', 140000, 987, "Developer");

        employee3 = new Employee();
        employee3.setEmployeeInfo("Ekaterina", 35, 'F', 150000, 432, "PO");


    }


    public static void main(String[] args) {

        Employee[] employees = {employee1, employee2, employee3};

        for (int a = 0; a < employees.length; a++){
            System.out.println("Name: "+employees[a].name+", ID: "+employees[a].employeeID);
        }




    }


}
