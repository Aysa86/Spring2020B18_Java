package day20_ArraysContinue;

public class Array_Size {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        //  size 3     0 1 2
        //System.out.println(arr1[100]); // out of range , array' size is fixed

        int [] num = new int[2]; //{0, 0}; range = 0~1
        num [0] = 10;// reassigned
        num [1] = 20;// reassigned

        System.out.println(num[0]); //10
        System.out.println(num[1]);//20

        num = new int[3]; // reset, {0, 0, 0}
        System.out.println(num[0]); // its gonna be 0, not 10, bc its reassigned to the new one
        System.out.println(num[1]);// 0
        System.out.println(num[2]);//0
    }

}
