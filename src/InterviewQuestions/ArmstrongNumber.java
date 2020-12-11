package InterviewQuestions;

public class ArmstrongNumber {


    public static boolean ArmstrongNum(int num){
        int a = 0;
        int b = 0;
        int c = num;

        while (num > 0){
            a = num % 10;
            num /= 10;
            b = b + (a*a*a);
        }
        if (c == b){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println( ArmstrongNum(371));
    }





    }





