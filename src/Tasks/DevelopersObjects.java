package Tasks;

public class DevelopersObjects {
    public static void main(String[] args) {

        Developers developer1 = new Developers();
        developer1.setDevelopersInfo("Aysa", 1234, "Developer", 120000);
        System.out.println(developer1);

        String code1 = "program";
        developer1.coding(code1);
        developer1.coding("Java");

        developer1.fixingBugs("bug in a program");




    }
}
