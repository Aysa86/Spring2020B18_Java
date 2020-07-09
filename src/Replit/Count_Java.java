package Replit;
import java.util.Scanner;
public class Count_Java {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        /*int count = 0;
        for(int i = 0; i < word.length(); i++){

            if(word.contains("java")){
                count++;

            }

        }

        System.out.println(count);*/

        word=word.toLowerCase();
        int count=0;
        while(word.contains("java")){
            count++;
            word=word.replaceFirst("java","");
        }
        System.out.println(count);

    }
}
