package day25_MethodsRecap;

public class ReturnStatement {
    public static void main(String[] args) {

       /* if(10>9){
            return; // exits the current method only

        }
        System.out.println("Hello");*/

       method1();
        System.out.println("Hello");// it will be printed

        method2();
        System.out.println("Hello");// nothing will be printed

    }



    public static void method1(){
        if(10>9){
            return;
        }




    }


    public static void method2(){
        if(10>9){
         System.exit(0);  // stops all programm
        }
        System.out.println("Hello Cybertek");
    }


}
