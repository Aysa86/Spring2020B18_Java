package day38_Constructors;

public class EmployeeSalary {
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(45, 40, 0.02, 0.2);
        SalaryCalculator salary2 = new SalaryCalculator(50, 40, 0.085,0.1 );

        System.out.println(salary1);
        System.out.println("==============================");
        System.out.println(salary2);

    }
}
