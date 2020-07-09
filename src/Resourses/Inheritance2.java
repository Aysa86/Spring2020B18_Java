package Resourses;

import day42_Inheritance.AccessModifiers;

public class Inheritance2 extends AccessModifiers {
//              sub class          super class
    public static void main(String[] args) {

        /*
        publicVariable
        protectedVariable

        publicMethod();
        protectedMethod();
         */

        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);

        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();

    }



}
