package day42_Inheritance;




class B{
    public B(int a){
        System.out.println("int");
    }

    public B(double a){

        System.out.println("double");

    }

    public B(long a){
        this(4.5);   // double
        System.out.println("long");// long

    }





}

public class InheritanceReview extends B{

    public InheritanceReview(String a){
        super(19);// int by default    a:19l ==> a with long argument   a:19.0 ==> a with double argument
        System.out.println("String");
    }

    public static void main(String[] args) {
        InheritanceReview obj = new InheritanceReview("Aysa"); //int, String
    }



}
