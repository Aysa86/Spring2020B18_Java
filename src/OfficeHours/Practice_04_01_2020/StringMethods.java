package OfficeHours.Practice_04_01_2020;

public class StringMethods {
    public static void main(String[] args) {

        //charAt(IndexNumber): returns the char at the given index, char primitive

        String str1 = "Java";
        //             0123
        char ch1 = str1.charAt(3);
        System.out.println(ch1);

        //char ch2 = str1.charAt(4);// out of range, gives an error
        //System.out.println(ch2);
        System.out.println("==========================================================");
        //length(): returns total numbers of chars, int

        String str2 = "Cybertek School";

           int total =  str2.length();//starts to count from 1
           System.out.println(total);

           int maxIndex = str2.length()-1;//starts to count from 0, last index number

           char ch3 = str2.charAt(maxIndex);
           System.out.println(ch3);

        System.out.println("==========================================================");

           //concat(str): concatenation, returns to new String

           String str3 = "Cybertek";
             str3 = str3.concat(" School");
        System.out.println(str3);

           String str4 = "Java";
           str4 = str4.concat(" is fun");
        System.out.println(str4);

        System.out.println("=============================================================");

        //toLowerCase() & toUpperCase(): change the case of the strings to upper or lower cases, returns a new string

         String str5 = "CYBERTEK SCHOOL";
         str5 =str5.toLowerCase();
         System.out.println(str5);

         String str6 = "aysa";
         str6 = str6.toUpperCase();
        System.out.println(str6);
        System.out.println("================================================================");

        // trim(): removes unused(white) spaces from the string,returns new string
        String str7 = "          Cybertek";
        str7 = str7.trim();
        System.out.println(str7.length()); //18==>8
        System.out.println(str7);

        System.out.println("================================================================");

        //substring(beginning index, ending index): creates substring starting from beginning index till ending index'
        //ending index is excluded

        String sentence1 = "I like Java"; // 10+1==>a
               //           012345678910
        //last index number = length - 1

        String word1 = sentence1.substring(7,11);//"Java";//String word1 = sentence1.substring(7,sentence1.length());
        System.out.println(word1);

        String word2 = sentence1.substring(2, 6);
        System.out.println(word2);

        String word3 = sentence1.substring(2, 7) + sentence1.substring(7,11);
        System.out.println(word3);
        //substring(beginning index):creates the substring from beginning index till the end of the string, returns new string

        String sentence2 = "I like to learn Java";
                  //        0123456789

        String r1 = sentence2.substring(10); // "learn Java"
        System.out.println(r1);

        String r2 = "Java"; //JaVa
               //    0123
        String r3 = r2.substring(0,2); //Ja
        String r4 = r2.substring(2,3); //v
               r4 = r4.toUpperCase(); //V
        String r5 = r2.substring(3); //a

        String result = r3+r4+r5; //JaVa
        System.out.println(result);

        System.out.println("================================================================");

        //replace(old string, new string): replace all the matching ones, returns string
        String str = "I like C#, C# is cool";
           str =  str.replace("C#", "Java"); //I like Java, Java is cool
        System.out.println(str);

        //replaceFirst(old string, new string): replace the first matching one, returns string

        String t1 = "Java is fun, Java is good";
           t1 = t1.replaceFirst("Java","C#");
        System.out.println(t1);

        System.out.println("================================================================");


        // indexOf(str):returns the index of first matching character, as an int
        String y1 = "Today W is Wednesday";
           int a1 =  y1.indexOf("W");
        System.out.println(a1); //6, first W's index number
        int a2 = y1.indexOf("Wednesday");// 11, second W's index number


        //lastIndexOf(str):returns the index of last matching character, as an int
        String y2 = "Cybertek School, School";
       int a3 =  y2.lastIndexOf("S");
        System.out.println(a3); //17, last S's index number










    }
}
