package OfficeHours.Practice_04_01_2020;

public class literal_new {

    public static void main(String[] args) {

        String s1 = "Java"; // String literal
        String s2 = "Java"; //String literal

        String s3 = new String("Java");
        String s4 = new String("Java");
        System.out.println(s1==s2); //true, the same objects
        System.out.println(s1 == s3);//false, different locations
        System.out.println(s3==s4);//true, the same location




    }

}
