package day19_Arrays;

public class Frequency {
    public static void main(String[] args) {
        /*
        2. write a program that can return the frequency of the characters in a string
		Ex: "AABCBCA" ==> "A3B2C2"

         */

        String str = "AABCC";
        String result = ""; // A2B1C2

        String nonDuplicates = ""; // ABC

        for(int i = 0; i <= str.length()-1; i++){
            if( ! nonDuplicates.contains( ""+str.charAt(i))){
              nonDuplicates += str.charAt(i);
            }
        }
       // System.out.println(nonDuplicates);

        // nonDuplicate = "ABC"; str = "AABCC"; ==> result = "A2B1C2"



        for(int j = 0; j <= nonDuplicates.length()-1; j++) {
            char ch = nonDuplicates.charAt(j);

            int count = 0; // count the total number of occurrence of each character from string
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            result += "" + ch + count;
        }
        System.out.println(result);


    }
}
