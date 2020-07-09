package Resourses;

import day40_Encapsulation.Encapsulation;
public class Encapsulations_Test {

    public static void main(String[] args) {

      Encapsulation obj = new Encapsulation();

        System.out.println(obj.getSSN());// 0

        obj.setSSN(87654321);

        System.out.println(obj.getSSN());// 87654321

    }
}
