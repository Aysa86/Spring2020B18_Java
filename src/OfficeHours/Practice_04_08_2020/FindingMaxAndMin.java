package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = -2147483648; // -21474... will be replaced by first input ==> 0, 0 will not be replaced by -5; then will be replaced by 10
        int min = 214748367;//0 less than min number, 0 will be assigned to min, 0 will be replaced by -5; 10 will not be replaced
        int a = 1;
        while (a <= 3) {

            System.out.println("Enter a number");
            int num = input.nextInt();//first input : 0, 2nd input: -5; 3rd input: 10

            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
            a++;
        }
        System.out.println(max+" is maximum number");
        System.out.println(min+" is minimum number");

    }
}
