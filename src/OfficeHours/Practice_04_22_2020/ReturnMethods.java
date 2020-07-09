package OfficeHours.Practice_04_22_2020;

public class ReturnMethods {
    public static void main(String[] args) {
        sum(1,6);

      int num1 =   sum2(4,6);
        System.out.println(num1);

        System.out.println("===========================");
        String str = "Cybertek";
        String result = "";
        for(int i = str.length()-1; i >=0; i--){
            result+=str.charAt(i);
        }

        System.out.println(result);

        String name = "Dzhalaeva Aysa"; // "level"
        String name2 = Reversed(name);
        System.out.println(name2);

        System.out.println(name.equalsIgnoreCase(name2));// palindrome or not, reusable
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static int sum2(int a, int b){
        System.out.println(a+b);
        return a+b;
    }

    public static String Reversed(String str){
        String result = "";
        for(int i = str.length()-1; i >=0; i--){
            result+=str.charAt(i);
        }
        return result;
    }





}
