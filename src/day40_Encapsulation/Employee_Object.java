package day40_Encapsulation;

public class Employee_Object {

    public static void main(String[] args) {

        EmployeeInfo employee1 = new EmployeeInfo();

        System.out.println(employee1.companyName);

        employee1.setAddress("Pennsylvania");
        System.out.println(employee1.getAddress());


        employee1.setID(12345678);
        System.out.println(employee1.getID());

        employee1.setSalary(120000);
        System.out.println(employee1.getSalary());

        employee1.setSSN(98765);
        System.out.println(employee1.getSSN());

    }
}
