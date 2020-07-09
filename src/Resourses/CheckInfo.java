package Resourses;

import day39_AccessModifiers.PersonalInfo; // in order to use class from other class, we have to import it

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println(PersonalInfo.name);
        System.out.println(PersonalInfo.gender);
       // System.out.println(PersonalInfo.grade); default, not in the same package
       // System.out.println(PersonalInfo.age);
       // System.out.println(PersonalInfo.SSN); private

        PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);
       // System.out.println(obj.grade); default accessable in the same package

       // System.out.println(obj.SSN); PRIVATE
        //System.out.println(obj.ID); PRIVATE



    }


}
