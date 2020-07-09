package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Aysa", 12345678, "Developer", 120000);
        //System.out.println(tester1);

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Tina", 87654321, "Product Owner", 2000000);

        Tester tester3 = new Tester();
        tester3.setTesterInfo("Eugene", 12344321, "SDET", 110000);

        Tester tester4 = new Tester();
        tester4.setTesterInfo("Ekaterina", 98127634, "Mummy", 120000);

        Tester tester5 = new Tester();
        tester5.setTesterInfo("Chingiz", 12348765, "SDET", 130000);

        ArrayList<Tester> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5));

        testers.removeIf(p -> ! p.jobTitle.contains("SDET"));

        double totalBudget = 0;
        for(Tester each : testers){
            System.out.println(each);
            totalBudget+=each.salary;

        }

        System.out.println(totalBudget);



    }
}
