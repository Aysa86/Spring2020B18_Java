package day42_Inheritance;


class test {

    public test() {
        System.out.println("super class's default constructor");
    }


}



    public class Constructor extends test{

    public Constructor(){
        System.out.println("sub class's default constructor");
    }

        public static void main(String[] args) {

        Constructor obj = new Constructor();




    }



}
