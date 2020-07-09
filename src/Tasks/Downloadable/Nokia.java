package Tasks.Downloadable;

public class Nokia extends Phone implements AndroidApps{
    /*
    5. create a class named Nokia that can inherit from AndroidApps interface
            actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()
    in each sub classes of phone, create a constructor to initialize the instances

     */

    public void texting(long phoneNumber){
        System.out.println("I'm texting "+phoneNumber+" from Nokia");
    }
    public void calling(long phoneNumber){
        System.out.println("I'm calling "+phoneNumber+" from Nokia");
    }
    public void freezing(){
        System.out.println("My Nokia is freezing");
    }
    public void breakTheFloor(){
        System.out.println("My phone is heavy, it's breaking the floor");
    }
    @Override
    public void download(){
        System.out.println("I download applications from "+appStoreName);
    }

    static {
        brand = "Nokia";
    }

    public Nokia( String model, double price, String size){
       this.model = model;
       this.price = price;
       this.size = size;
    }
}
