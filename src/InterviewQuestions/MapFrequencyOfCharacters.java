package InterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyOfCharacters {

    public static void frequency(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character each : str.toCharArray()){
            if (map.containsKey(each)){
                map.put(each, map.get(each)+1);
            }else{
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {

         frequency("You are the best");
    }
}
