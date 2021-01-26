package InterviewQuestions;

public class sumOfDigitsInString {

    public static int sumOfDigits(String str){
        int total = 0;
        char ch[] = str.toCharArray();
        for (char each: ch) {
            if (Character.isDigit(each)){
                total+=Integer.valueOf(""+each);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println( sumOfDigits("Total score is 183"));
    }
}
