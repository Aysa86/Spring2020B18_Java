package InterviewQuestions;

public class removeWhiteSpaces {

    public static void main(String[] args) {
        String s ="i am a bad boy";
        s=s.replaceAll("\\s+","");
        System.out.println(s);
    }

}
