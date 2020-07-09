package day22_Arrays_Loops;

public class Java_Python {
    public static void main(String[] args) {

        /*
        3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
         */

        String sentence = "I like java and javascript, python and python";
        int countJava = 0;//2
        int countPython = 0;//2
        String [] words = sentence.split(" "); // [I, like, Java, and, javascript, python, and, python]

        sentence = sentence.toLowerCase();

        for(String each : words){
            if(each.contains("java")){
                countJava++;
            }
            if(each.contains("python")){
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);
        System.out.println(countJava==countPython);

    }
}
