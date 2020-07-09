package Replit;
import java.util.*;
public class Assesment4_isSort {
    public static boolean isSort(int[] nums) {

        for(int i=0; i<=nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println( isSort(nums)  );
    }
}
