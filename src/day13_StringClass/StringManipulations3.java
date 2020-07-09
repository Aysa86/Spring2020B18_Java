package day13_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {

        String str = "I like java programming";

        int num1 = str.indexOf("j");
        System.out.println(num1);

        String str1 = "Cybertek school is awesome";
        //             0123456789

        int firstS = str1.indexOf("s"); //9
        int secondS = str1.indexOf("is") +1 ;
        //        str1.indexOf("is")==> returns the index number of i
        System.out.println(firstS);
        System.out.println(secondS);


        /*String names = "Muhtar";
        int a1 =names.indexOf("Good Guy");
        System.out.println(a1); // -1*/

        String fullName = "Aysa Dzhalaeva";
        String firstName = fullName.substring(0, fullName.indexOf(" ") );
        String lastName = fullName.substring( fullName.indexOf(" ") + 1);

        System.out.println(firstName);
        System.out.println(lastName);



    }
}
