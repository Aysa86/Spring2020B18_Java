package day29_Wrapper_ArrayList;

import Resourses.Library;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);

        int maxNum = Integer.MIN_VALUE;// or int maxNum = list.get(0);

        for(int a = 0; a <=list.size()-1; a++ ){// i: 0,1,2,3,4
            if(list.get(a) > maxNum){
                maxNum = list.get(a);
            }
        }
        System.out.println(maxNum);

        int maxNum2 = list.get(0);

        for(Integer each : list){
            if(each > maxNum2){
                maxNum2 = each;
            }
        }
        System.out.println(maxNum2);

        int minNum = Integer.MAX_VALUE;

        for(int b = 0; b <= list.size()-1; b++){
            if(list.get(b) < minNum){
                minNum = list.get(b);
            }
        }
        System.out.println(minNum);

        int minNum2 = list.get(0);

        for(Integer each : list){
            if(each < minNum2){
                minNum2 = each;
            }
        }
        System.out.println(minNum2);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);

     //int maximum =  max(list2);
        int maximum = Library.max(list2);
        System.out.println(maximum);
    }

    public static int max(ArrayList<Integer>list){
        int maxNum = Integer.MIN_VALUE;// or int maxNum = list.get(0);

        for(int a = 0; a <=list.size()-1; a++ ){// i: 0,1,2,3,4
            if(list.get(a) > maxNum){
                maxNum = list.get(a);
            }
        }
        return maxNum;
    }




}
