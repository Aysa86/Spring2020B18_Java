package day25_MethodsRecap;

public class Frequency {
    public static void main(String[] args) {
        /*
        2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
		Ex:
			Frequency("AAABB", "A");  ==> 3
			Frequency("ABAB", "B"); ==> 2

         */

        String str1 = "AAA";
        String str2 = "A";

        int count = 0;

        while(str1.contains(str2)){
            count++;
           str1 =  str1.replaceFirst(str2, "");// we need to make sure that we r not counting the same index over again
        }

        System.out.println(count);

        String a = "python python python python";
        String b = "python";

       int num1 =  Frequency(a,b);
        System.out.println(num1);
    }

    public static int Frequency(String str1, String str2){
        int count = 0;

        while(str1.contains(str2)){
            count++;
            str1 =  str1.replaceFirst(str2, "");// we need to make sure that we r not counting the same index over again
        }

        return count;



    }


    }






