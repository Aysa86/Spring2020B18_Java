package day34_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Dzhalaeva", 123, "tester", 100000);

        ScrumTeam scrum = new ScrumTeam();
            scrum.hireTester(tester1);
            System.out.println(scrum.testersTeam.size()); //1


        scrum.fireTester(123);
        System.out.println(scrum.testersTeam.size()); // 0





    }
}
