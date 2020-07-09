package day02_Variables;

public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("\tAysa");
        System.out.println("\t\t\t\t\taysa");
        // \t means a paragraph space
        System.out.println("Cybertek School");
        System.out.println("Cybertek \nSchool");
        System.out.println();// this one for space between School and My lines



        System.out.println("My\nName\nIs\nAysa"); // \n means new line

        // print: My favourite TV show is "Game of Thrones"

        System.out.println("My favourite show is \"Game of Thrones\"");
        // \" means double quote, prints double quote

        System.out.println("\\");
        //prints single slash on the console

        System.out.println("/");

        System.out.println("My favourite book is 'Java'");// prints single quote

        System.out.println("My favourite book is \'Java\'");// prints single quote

    }
}
