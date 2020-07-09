package day14_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {

        String str = " ";
        boolean bool1 = str.isEmpty();// true "", " " false, it has space
        System.out.println(bool1);

        String userName = "";
        if(userName.isEmpty()){
            System.out.println("please provide the user name");

        }
        String s1 = "Cat";// String literal
        String s2 = new String("Cat");

        System.out.println(s1 == s2); // false, different memory locations, different objects
        System.out.println(s1.equals(s2)); // true


        String z1 = "Tiger";
        String z2 = new String("Tiger");
        String z3 = "Tiger";

        // ==
        System.out.println(z1 == z2);//false
        System.out.println(z2 == z3);//false
        System.out.println(z1 == z3);// true in same object
        // equals():
        System.out.println(z1.equals(z2)); // true
        System.out.println(z2.equals(z3));// true
        System.out.println(z1.equals(z3));// true

        // .equals() gives false when you have different text, not matching objects






    }
}
