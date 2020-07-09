package OfficeHours.Practice_06_03_2020;

public class StringPractice2 {
    /*
    6) Create a method that will accept a String of multiple words
    separated by a space and return the String with which part reversed.

    Ex: The house is big
    ehT esuoh si gib
     */



    public static String reverseEachWord(String str){

        String [] words = str.split(" "); // find a space
        String finalWord = "";


        for(String each : words){
            String reversed = "";
            for (int a = each.length()-1; a >= 0; a--){
                reversed +=each.charAt(a);
            }
            finalWord+=reversed+" ";
        }



       return finalWord;

    }



    public static void main(String[] args) {
        String sentence = "My name is Aysa";
        System.out.println(reverseEachWord(sentence));



    }



}
