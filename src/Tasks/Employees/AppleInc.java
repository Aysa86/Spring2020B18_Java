package Tasks.Employees;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {
    /*
     6. create a class named AppleInc:
            create 2 Tester' and 3 Developer' objects
            create a list of ScrumTeam and store all Tester's and Developer's objects
            Iterator the list of scrum team to diplay the informations of the full time employees

     */
    public static void main(String[] args) {
        Employees tester1 = new Tester("Aysa", 123, 120000, 12345678, "SDET", true, true);
        Employees tester2 = new Tester("John", 543, 120000, 98765432, "SDET", false, true);
        Employees developer1 = new Developer("Sandra", 907, 130000, 87650932, "Developer", true, false);
        Employees developer2 = new Developer("Michael", 539, 130000, 62819036, "Developer", true, true);
        Employees developer3 = new Developer("Lily", 604, 123000, 27180362, "Junior developer", false, false);

        ArrayList<Employees> list = new ArrayList<>(Arrays.asList(tester1, tester2, developer1, developer2, developer3));

        for (Employees each : list){
            if(each.isFullTime()){
                System.out.println(each);
           }
        }
    }
}
