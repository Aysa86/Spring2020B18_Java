package Replit;
import java.util.ArrayList;
public class Methods_187 {


    public static ArrayList<String>  combineAl(ArrayList<String>wordList1, ArrayList<String>wordList2){

        ArrayList<String> combineAl = new ArrayList<>();
        for(String each : wordList1){
            combineAl.add(each);
        }
        for(String each : wordList2){
            combineAl.add(each);
        }
        return combineAl;

    }

    public static void main(String[] args) {
       ArrayList<String> wordList1 = new ArrayList<>();
        wordList1.add("Aysa Dzhalaeva");
        //System.out.println(wordList1);

        ArrayList<String> wordList2 = new ArrayList<>();
        wordList2.add("Vladimirovna");
        //System.out.println(wordList2);

        System.out.print(combineAl(wordList1, wordList2));






    }


}
