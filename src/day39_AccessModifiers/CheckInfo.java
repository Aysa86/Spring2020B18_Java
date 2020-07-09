package day39_AccessModifiers;

public class CheckInfo {

    public static void main(String[] args) {


        System.out.println("Name is: "+PersonalInfo.name);
        System.out.println("Gender is: "+PersonalInfo.gender);

      //  System.out.println("Grade is: "+PersonalInfo.grade);
       // System.out.println("SSN: "+PersonalInfo.SSN);            DON'T COMPILE PRIVATE ACCESSABLE WITHIN ONE CLASS
       // System.out.println("ID: "+PersonalInfo.ID);
       // System.out.println("Age: "+PersonalInfo.age);

        PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);
        System.out.println(obj.grade);
        System.out.println(obj.age);


    }
}
