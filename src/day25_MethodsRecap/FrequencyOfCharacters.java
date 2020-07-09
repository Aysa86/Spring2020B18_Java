package day25_MethodsRecap;

import Resourses.Library;

public class FrequencyOfCharacters {
    /*
    3. Combine above two methods to write a return method that can return the frequencyt of characters as
	a stringfrom any given string
		Ex:
			FrequencyOfChars("ABABCB"); ==> "A2B3C1";
			FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
     */

    public static void main(String[] args) {

        String str = "AABBCC"; //A2B2C2
        String NonDuplicate =  Library.RemoveDuplicates(str);

       // System.out.println(NonDuplicate); // ABC
        String result = "";
        for(int i = 0; i < NonDuplicate.length(); i++) {

            String ch = "" + NonDuplicate.charAt(i); // "A"
            int num = Library.Frequency(str, ch);
            //System.out.print(ch + num);
            result+=ch+num;
        }
        System.out.println(result);

    }

    public static String FrequencyOfChars(String str){
        String NonDuplicate =  Library.RemoveDuplicates(str);
        String result = "";
        for(int i = 0; i < NonDuplicate.length(); i++) {

            String ch = "" + NonDuplicate.charAt(i); // "A"
            int num = Library.Frequency(str, ch);
            //System.out.print(ch + num);
            result+=ch+num;
        }
        return result;

    }


}
