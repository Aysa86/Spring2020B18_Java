package Tasks.Abstract_Employee;

public class EmployeeObjects {
    public static void main(String[] args) {

        Tester tester = new Tester("Aysa", 33, 'F', 120000, "SDET");
        System.out.println(tester);
        tester.work();

        Developer developer = new Developer("Eugene", 33, 'M', 140000, "Developer");
        System.out.println(developer);
        developer.work();
    }
}
