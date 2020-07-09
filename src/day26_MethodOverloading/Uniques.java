package day26_MethodOverloading;

public class Uniques {
    public static void main(String[] args) {
        String str = "ABB";

        String result = "";//A
        for(int i = 0; i < str.length(); i++){
            int num =  frequency(str,str.charAt(i));
            if(num == 1){
                result += str.charAt(i);
            }

        }

        System.out.println(result);

        String str2 = "Cybertek";
        String result2 = Uniques(str2);
        System.out.println(result2);

    }

    public static String Uniques(String str){
        String result = "";//A
        for(int i = 0; i < str.length(); i++){
            int num =  frequency(str,str.charAt(i));
            if(num == 1){
                result += str.charAt(i);
            }

        }
        return result;
    }


    public static int frequency(String str, char ch) { // counts char' frequency

        char[] arr = str.toCharArray();// [A, A, A]

        int count = 0;
        for (char each : arr) {
            if (each == ch) {
                count++;
            }

        }
        return count;
    }
}