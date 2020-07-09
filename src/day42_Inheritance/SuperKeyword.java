package day42_Inheritance;


class A{ // parent class
    int a = 100;

    public A(double b){
        System.out.println(this.a); // 100
    }





}




public class SuperKeyword extends A {
    int a = 200;

    public SuperKeyword(){
        super(9.8);//100
        System.out.println(super.a);// 100
    }

    public static void main(String[] args) {

        SuperKeyword ob1 = new SuperKeyword();
        A ob2 = new A(9.0);
    }


}
