package OfficeHours.Practice_04_01_2020;

public class StringMethods2 {
    public static void main(String[] args) {

        //isEmpty(): checks if the String is empty, returns boolean
        String str1 = "    ";
        String str2 = "";
        boolean r1 = str1.isEmpty();//false
        boolean r2 = !str1.isEmpty();// true
        boolean r3 = str2.isEmpty();// true
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("==========================================================");

        //equals(str): checks if two string of text equals or not, returns boolean
        //equalsIgnoreCase(str):checks if two string of text equals or not, (without case sensitivity) returns boolean
        String s1 = "Cat";
        String s2 = new String("Cat");
        String s3 = "cat";
        System.out.println(s1==s2);// false, memory locations are different
        System.out.println(s1.equals(s2)); // true, visibly same
        System.out.println(s3.equals(s1));//false, case sensitivity

        System.out.println(s3.equalsIgnoreCase(s1)); // true, ignores the case sensitivity

        System.out.println("==========================================================");

        // contains(str): checks if the str is included in the string, returns boolean

        String sentence = "I like to learn Java";
        System.out.println(sentence.contains("Java"));// true

        String sentence2 = "Top 3 viruses are: 1. Corona, 2. Hanta, 3. Ebola";
        System.out.println(sentence2.contains("Java"));// false


        System.out.println("==========================================================");

        // startsWith(str):checks if the string started with given str, returns boolean
        //endsWith(str):checks if the string ends with given str, returns boolean

        String webAddress = "www.amazon.com";
        System.out.println(webAddress.startsWith("www"));// true
        System.out.println(webAddress.startsWith("wwww"));// false


        String gMail = "adzhalaeva@gmail.com";
        System.out.println(gMail.endsWith("@gmail.com"));// true
        System.out.println(gMail.endsWith("@hotmail.com"));// false

    }
}
