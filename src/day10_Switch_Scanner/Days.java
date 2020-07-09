package day10_Switch_Scanner;

public class Days {
    public static void main(String[] args) {


        /*Warm up task:
        2. write a program that can display the days based on the numbers 1 ~ 7
        MUST USE NESTED IF
        */
               int num = 5;
                String result = " ";
               //if(num>=1 && num<=7){ //num>0 &&num<8;
                   result= (num==1) ? "Monday" : (num==2) ? "Tuesday" : (num==3) ? "Wednesday" : (num==4) ? "Tuesday":
                           (num==5) ? "Friday" : (num==6) ? "Saturday" : (num ==7) ?"Sunday": "Invalid";
        System.out.println(result);













    }
}
