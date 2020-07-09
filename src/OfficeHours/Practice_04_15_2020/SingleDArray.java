package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArray {
    public static void main(String[] args) {

        int a = 100;
        int [] arr = {100,200,300};
        //             0   1   2

        System.out.println(arr[1]); // 200
        //             i < 3
        for(int i = 0; i <=2; i++){ // i : represents index number of each element
          //  System.out.println(i); 0,1,2
          int num = arr[i];
            System.out.println(num);
        }

        System.out.println("===============================");

        int b = 0;
        while (b <= 2){
            int num = arr[b];
            System.out.println(num);
            b++;
        }

        System.out.println("===================================");

        String[] names = {"John", "Aaron", "Aysa"};// size is 3
        //                   0       1        2
        int length = names.length;//3
        String [] namesReversed = new String [length];//{null, null, null}
        //                                                 0     1     2
       /*
        //            i          j
        namesReversed[0] = names[2];
        namesReversed[1] = names[1];
        namesReversed[2] = names[0];
        */
       /*
        int j = length-1;// index number of the last index
        for(int i = 0; i < length; i++){
            namesReversed[i] = names[j];
            j--;
        }
*/
        int i = 0;
        int j = length-1;

        while(i < length){

            namesReversed[i] = names[j];
            i++;
            j--;
        }







        System.out.println(Arrays.toString(namesReversed));



    }
}
