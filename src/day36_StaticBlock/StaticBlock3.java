package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Tester;

public class StaticBlock3 {

    static String name;
    static int num;
    static Tester tester1;

    static {
        name = "Ekaterina";
        num = 1208;
        tester1 = new Tester();
        tester1.setInfo("Eugene", "SDET", 100000, 12345);

    }

    public static void main(String[] args) {

        name = "Aysa";
        num = 2212;

        System.out.println(name);// Aysa
        System.out.println(num);// 2212      IF I USE IT IN THIS CLASS, IT WORKS, OUTSIDE THE CLASS IT DOESNT WORK
    }

}
