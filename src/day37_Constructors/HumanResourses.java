package day37_Constructors;

public class HumanResourses {
    /*
    2. create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees
     */

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();

   /* public static void main(String[] args) {
        employee1.setEmployeeInfo("Aysa", 1234, 12345678, "SDET", 100000, 'F');
        employee2.setEmployeeInfo("Eugene", 1346, 98765432, "QA", 90000, 'M');
        employee3.setEmployeeInfo("Eketerina", 7654, 65432109, "Developer", 120000, 'F');
        employee4.setEmployeeInfo("Tina", 4321, 45678902, "Developer", 120000, 'F');
        employee5.setEmployeeInfo("Douglas", 5432, 23416783, "SDET", 110000, 'M');

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);

    }*/

    static {
        employee1.setEmployeeInfo("Aysa", 1234, 12345678, "SDET", 100000, 'F');
        employee2.setEmployeeInfo("Eugene", 1346, 98765432, "QA", 90000, 'M');
        employee3.setEmployeeInfo("Eketerina", 7654, 65432109, "Developer", 120000, 'F');
        employee4.setEmployeeInfo("Tina", 4321, 45678902, "Developer", 120000, 'F');
        employee5.setEmployeeInfo("Douglas", 5432, 23416783, "SDET", 110000, 'M');

    }









}

