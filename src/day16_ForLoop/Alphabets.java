package day16_ForLoop;

public class Alphabets {
    public static void main(String[] args) {

        String upperCase = "";//A~Z
        String lowerCase = "";//a~z

        for(char ch = 'A'; ch <='Z'; ch++){
            upperCase += ch;
        }
        System.out.println(upperCase);

        for(char ch = 'a'; ch<='z'; ch++){
            lowerCase += ch;
        }
        System.out.println(lowerCase);
        // Aa Bb Cc...

        String result = "";    //last index number
        for(int i = 0; i <= upperCase.length()-1; i++){
            result += upperCase.charAt(i)+""+ lowerCase.charAt(i)+" "; //""==> returns String
        }
        System.out.println(result);

        //second solution

        int a = 97;
        int A = 65;
        String result2 = "";
        for(int i = 0; i < 26; i++){
           char ch = (char) (A + i);// upper case characters
            //we reassigned   65 in char
            char ch2 = (char)(a + i);// lower case
             //we reassigned  97+0 in char
            result2 += ch + ""; //"" returns us String

            System.out.println(result2);

        }




    }
}
