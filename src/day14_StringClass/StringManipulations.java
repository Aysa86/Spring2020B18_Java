package day14_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

        String str = "I like to learn Java. I like to watch the movie Jumanji";

        int a1 = str.indexOf("J"); // returns the index number of the first matching one
        System.out.println(a1);

        int a2 = str.indexOf("Jum");
        System.out.println(a2);

        int a3 = str.indexOf(" I") +1;// second I's index number
        System.out.println(a3);

        String s = "I like Java and I like reading";
        int b1 =  s.lastIndexOf("I");
        System.out.println(b1);

        int b2 = s.lastIndexOf("l");
        System.out.println(b2);

        String z = "I like C#, C# is cool";
        int b3 = z.lastIndexOf("C");
        System.out.println(b3);

        String x = "I like Java, Java is fun, Java programming is fun";
        int b4 = x.indexOf("Java is");// second J's index number
        //int b4 = x.indexOf(", J")+2; 1-comma,2-space,thats why +2
        System.out.println(b4);

        int d5 = x.lastIndexOf("J"); //last J's index number
        System.out.println(d5);

        int d6 = x.lastIndexOf("Java p"); //last J's index number
        System.out.println(d6);

        char ch1 = x.charAt(26);
        System.out.println(ch1);




    }
}
