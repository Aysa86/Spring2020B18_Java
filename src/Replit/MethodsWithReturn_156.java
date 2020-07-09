package Replit;

public class MethodsWithReturn_156 {
    public static int  count_appearance(String[] arr, String t)
    {
        int count = 0;
        for(String each : arr){
            if(each.equalsIgnoreCase(t)){
                count++;
            }
        }



        return count;
    } //end  count_appearance

}
