package Replit;

import java.util.Arrays;

public class CombineFullName {
    public static String[] combineNames(String[] first_names, String[] last_names) {

        String[] name = new String[first_names.length];
        for (int i = 0; i < first_names.length; i++) {
            name[i] = first_names[i] + " " + last_names[i];
        }
        return name;
    }

public static void main (String[]args){

        String [] firstName = {"Aysa"};
        String [] lastName = {"Dzhalaeva"};
    System.out.println(Arrays.toString(combineNames(firstName, lastName)));

            //feel free to test code here
        }


}
