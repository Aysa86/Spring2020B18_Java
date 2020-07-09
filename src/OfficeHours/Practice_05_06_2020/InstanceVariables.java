package OfficeHours.Practice_05_06_2020;

public class InstanceVariables {

    int a = 100; // instance variable, created outside the block, belongs to the objects



    public static void main(String[] args) {
        int a = 100; // local variable

        InstanceVariables object1 = new InstanceVariables();
        object1.a = 300;
        System.out.println(object1.a);// 300


        InstanceVariables object2 = new InstanceVariables();
        System.out.println(object2.a);// 100



    }
}
