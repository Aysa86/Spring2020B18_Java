package day15_ForLoop;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Java";


        String reverse1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);

        String reverse2 = "";

        int lastIndexNumber = str.length()-1;

        for(int i = lastIndexNumber; i>=0; i--) {

            //System.out.print(str.charAt(i));

            reverse2 += str.charAt(i);
            System.out.println(reverse2);
        }



    }
}
