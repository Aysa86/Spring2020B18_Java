package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DeveloperObject {
    public static void main(String[] args) {

        Developer developer1 = new Developer();
        developer1.setInfo("Aysa", "Developer", 130000, 12345);
        System.out.println(developer1);

        Developer developer2 = new Developer();
        developer2.setInfo("Eugene", "Junior Developer", 120000, 54321);

        developer1.coding();
        developer2.fixingBugs();

        System.out.println("=============================================");

        Developer [] arr = {developer1, developer2};

        for(int a = 0; a < arr.length; a++) {

            System.out.println(arr[a]);

        }

        for(Developer eachDeveloper : arr){
            System.out.println(eachDeveloper);
        }

        System.out.println("============================================");

        ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(arr));
       // developers.addAll(Arrays.asList(developer1, developer2));

      /* for(int a = 0; a < developers.size(); a++){
           System.out.println(   developers.get(a).name);
       }
*/
         for(Developer eachDeveloper : developers){
             System.out.println(eachDeveloper.name+" "+eachDeveloper.jobTitle);
         }





    }
}
