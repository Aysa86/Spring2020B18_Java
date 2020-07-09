package day50_polymorphism;

public class Inheritance {
   public int publicInt = 100;// can be inherited anywhere
   protected int protectedInt = 200;// can be inherited outside the package
   int defaultInt = 300;// no inheritance outside the package
   private int privateInt = 400;// no way to inherit private variable

}

class Data extends Inheritance{
    public static void main(String[] args) {
        Data obj = new Data();
        System.out.println(obj.publicInt);
        System.out.println(obj.protectedInt);
        System.out.println(obj.defaultInt);
       // System.out.println(obj.privateInt);

    }
}