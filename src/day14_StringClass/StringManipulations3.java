package day14_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {

        String str1 = "CYBERTEK";
        String str2 = "cybertek";

        System.out.println(str1.equals(str2)); //false

        System.out.println(str1.equalsIgnoreCase(str2)); //true, ignores the case sensitivity



        String s1 = "Cybertek School";
        boolean r1 = s1.contains("School"); // true, if "school" ==> false


        /*
        valid password must contains a special character such as (! , _ , $)
        valid password should not contain spaces
         */

         String passWord = "mmsad1234";

         if(passWord.contains(" ")){
             System.out.println("Password can not have space in it");
         }else{
             System.out.println("Valid password");
         }



         String s3 = "United States";
        System.out.println(s3.startsWith("U"));// true

        String s4 = "Cybertek School";
        boolean w1 = s4.endsWith("l");
        System.out.println(w1);



    }
}
