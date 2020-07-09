package day50_polymorphism;

public class Encapsulation {
    private String userName = "Cybertek";

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

}

class Test{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
       // System.out.println(obj.userName);
        System.out.println(obj.getUserName()); //Cybertek


        obj.setUserName("MIT");// assign to MIT
        System.out.println(obj.getUserName());// after reassigning to read it we call getter again



    }
}
