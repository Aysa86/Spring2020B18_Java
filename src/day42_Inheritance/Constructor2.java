package day42_Inheritance;

class Test{

    public Test(int a){// at least one parent class' constructor MUST be called in sub class
        this(2.5);//C
        System.out.println("A");
    }
    public Test(double a){
    System.out.println("C");

    }

}






public class Constructor2 extends Test{

    public Constructor2(){
        super(10);// A
        System.out.println("B");
    }

    public static void main(String[] args) {
      //  Test obj = new Test(10);// A
       Constructor2 obj2 = new Constructor2();// AB
    }





}
