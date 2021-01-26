package InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ArrayListAscendingOrder {
    public static List<Integer> sort(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.size(); j++){
                if (list.get(i) < list.get(j)){
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }

            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(sort(Arrays.asList(1,5,7,9,2,0,1)));
    }

}
