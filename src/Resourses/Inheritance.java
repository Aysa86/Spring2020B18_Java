package Resourses;

import day42_Inheritance.Data;

public class Inheritance extends Data {
    //         sub class          super class

    public static void main(String[] args) {

        System.out.println(Inheritance.protectedData);// protected is always visible to any sub class
        System.out.println(Inheritance.publicData);
       // System.out.println(Inheritance.defaultData); not inheritable in the different package
       // System.out.println(Inheritance.privateData); never be inherited





    }


}
