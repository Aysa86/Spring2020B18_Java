package Resourses;

import day39_AccessModifiers.AccessModifiers;

public class AccessModifier_Test {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.publicAccess);// open to the world
      //  System.out.println(obj.defaultAccess); doesn't compile!!! default: only accessable in the same package
      // System.out.println(obj.SSN); doesn't compile, SSN private, it can be used in the same class



    }
}
