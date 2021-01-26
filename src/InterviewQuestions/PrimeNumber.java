package InterviewQuestions;

public class PrimeNumber {

    public static boolean isPrime(int num){
        boolean result = true;
        if(num<2){
            return false;
        }
        for (int i = 2; i < num; i++){
            if(num%2 == 0){
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }
}
