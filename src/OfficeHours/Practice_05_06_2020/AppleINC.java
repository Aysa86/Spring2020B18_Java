package OfficeHours.Practice_05_06_2020;

public class AppleINC {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Ekaterina", "SDET", 120000, 1234);

        Tester tester2 = new Tester();
        tester2.setInfo("Aysa", "Junior SDET", 110000, 4321);

        Tester tester3 = new Tester();
        tester3.setInfo("Eugene", "Senior SDET", 130000, 9876);

        ScrumTeam scrum1 = new ScrumTeam(); // we can use the arrayList in Scrum class, thats why we created ScrumTeam
        scrum1.hireTester(tester1);
        scrum1.hireTester(tester3);
        scrum1.hireTester(tester2);

        scrum1.fireTester(9876);


       // scrum1.testersTeam returns the testerTeam arrayList from scrum1

        for(Tester each : scrum1.testersTeam){// scrum1 is an object, we can use ArrayList testersTeam
            System.out.println(each);
        }

        System.out.println("==========================================================================");

        Developer developer1 = new Developer();
        developer1.setInfo("John", "Developer", 140000, 98765);

        Developer developer2 = new Developer();
        developer2.setInfo("Anna", "Junior developer", 120000, 12345);

        Developer developer3 = new Developer();
        developer3.setInfo("Linda", "Senior Developer", 150000, 54321);

        scrum1.hireDeveloper(developer2);
        scrum1.hireDeveloper(developer3);
        scrum1.hireDeveloper(developer1);

        scrum1.fireDeveloper(12345);


        System.out.println(scrum1.developersTeam.size());

        scrum1.fireDeveloper(12345);

        for(Developer eachDeveloper : scrum1.developersTeam){
            System.out.println(eachDeveloper);
        }
        System.out.println("======================================================");

        System.out.println("In my scrum team we have "+scrum1.testersTeam.size()+" tester and "
                +scrum1.developersTeam.size()+" developers");
          // In my scrum team we have 2 tester and 2 developers

    }
}
