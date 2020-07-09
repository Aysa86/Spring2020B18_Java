package day13_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {

        String str = "Cybertek School is the best";
                 //   012345678
        String schoolName = str.substring(0,8);
        System.out.println(schoolName);


        String fullName = "Aysa Dzhalaeva";
                      //   0123456789..
        String firstName = fullName.substring(0,4) ;
        System.out.println(firstName);

        String lastName = fullName.substring(5,13+1);
        System.out.println(lastName);

        String aysa = "Aysa Dzhalaeva";
        //             0123456789..
        String firstName1 = aysa.substring(0,4);
        System.out.println(firstName1);

        String lastName1 = aysa.substring(5,13+1);
        System.out.println(lastName1);

        String gmail = lastName1.concat("_").concat(firstName1).concat("@gmail.com");
        System.out.println(gmail);

        String gmail1 = lastName1+"_"+firstName1+"@gmail.com";
        System.out.println(gmail1);


        String s1 = "I love Java Programming Language";
        //           01234567
        String className = s1.substring(7);
        System.out.println(className); // Java Programming Language;

        String s2 = "I like C# Programming";
        s2 = s2.replace("C#", "Java");
        System.out.println(s2);

        String name = "COVID 18";
        name = name.replace("8","9");
        System.out.println(name);


        String r1 = "I like C#, C# is fun, C# is cool";
        r1 = r1.replaceFirst("C#", "Java");
        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday ";
        r2 = r2.replaceFirst("Tomorrow", "Today");
        System.out.println(r2);








    }
}
