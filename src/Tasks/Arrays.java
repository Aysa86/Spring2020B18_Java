package Tasks;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner input = new Scanner((System.in));

        int [] arr = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(), input.nextInt() };

        /*for(int a = 0; a < arr.length; a++){
            System.out.println(arr[a]);
        }*/


       for(int b = arr.length-1; b >= 0; b-- ){
            System.out.println(arr[b]);
        }


    }







}
