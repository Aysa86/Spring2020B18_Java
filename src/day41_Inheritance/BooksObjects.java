package day41_Inheritance;

public class BooksObjects {
    public static void main(String[] args) {

        EBook book1 = new EBook();
        book1.title = "Hamlet";
        book1.author = "William Shakespeare";
        book1.price = 20;
        book1.size = "1.5MB";
        book1.pages = 100;

        System.out.println(book1);

        System.out.println("Size: "+book1.size);
        System.out.println("Pages: "+book1.pages);

        book1.readBook();

        System.out.println("============================================");

        AudioBook book2 = new AudioBook();
        book2.title = "Becoming";
        book2.author = "Michelle Obama";
        book2.price = 25;
        book2.length = "3 hours and 30 minutes";
        book2.narrator = "Dzhalaeva";

        System.out.println(book2);

        System.out.println("Length of the audio book \""+book2.title+"\" is "+book2.length);
        System.out.println("Narrator: "+book2.narrator);
        book2.listen();



    }
}
