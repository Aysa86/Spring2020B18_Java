package day21_multyDimentionalArrays;

public class Longest_Shortest_Words {
    public static void main(String[] args) {
        /*
        2. write a program that can return the logest string of text from an array
	    3. write a program that can return the shortest string of text from an array
         */

        String names [] = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana"};

        int maxLengthString = names[0].length();// length of first name "Reem"
        int minLengthString = names[0].length();

        String longestWord = "";
        String shortestWord = "";

//starts from 1, bc we have to compare first name with the rest names
        for(int i = 1; i <=names.length-1; i++ ){

            if(names[i].length() > maxLengthString){
                maxLengthString = names[i].length();
                longestWord = names[i];
            }
            if(names[i].length() < minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }

        }

        System.out.println(longestWord);
        System.out.println(shortestWord);

    }
}
