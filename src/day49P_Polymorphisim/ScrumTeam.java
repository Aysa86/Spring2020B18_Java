package day49P_Polymorphisim;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
   /* 4. create a class named ScrumTeam:
    create an arraylist and store 3 testers and 4 developers*/
   public static void main(String[] args) {

       Employee tester1 = new Tester("John", 123, "Senior tester", 120000);
       Employee tester2 = new Tester("Aysa", 432, "Tester", 110000);
       Employee tester3 = new Tester("Anna", 987, "Junior Tester", 10000);

       Employee developer1 = new Developer("Nana", 876, "Senior developer", 150000);
       Employee developer2 = new Developer("Irene", 345, "Developer", 130000);
       Employee developer3 = new Developer("Sam", 547, "Developer", 130000);
       Employee developer4 = new Developer("Mike", 534, "Junior developer", 120000);

       ArrayList<Employee> list = new ArrayList<>(Arrays.asList(tester1, tester2, tester3, developer1, developer2, developer3, developer4));
       System.out.println("=============TESTERS==============");
       System.out.println(tester1);
       System.out.println(tester2);
       System.out.println(tester3);
       System.out.println("===========DEVELOPERS=============");
       System.out.println(developer1);
       System.out.println(developer2);
       System.out.println(developer3);
       System.out.println(developer4);




   }

}
