package day17_WhileLoops;

public class Frequency {
    public static void main(String[] args) {

        String str = "Java is fun, Java is cool";

        int count = 0;

        while(str.contains("Java")){

            count++;
            str = str.replaceFirst("Java", "");

        }
        System.out.println(count);//2



    }
}
