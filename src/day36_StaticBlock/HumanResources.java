package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Developer;

public class HumanResources {

    static  Developer developer1 = new Developer();
    static Developer developer2;// we can declare dev2 in a static block
    static Developer developer3 = new Developer();
    static Developer developer4 = new Developer();
    static Developer developer5 = new Developer();


   /* public static void main(String[] args) {

        developer1.setInfo("Aysa", "Developer", 120000, 1234);



    }*/
   static {
       developer1.setInfo("Aysa", "Developer", 120000, 1234);
       developer2 = new Developer();



   }



}
