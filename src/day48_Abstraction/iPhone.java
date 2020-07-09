package day48_Abstraction;

public class iPhone extends Phone{

    public iPhone( String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;
    }
    static {
        brand = "iPhone";
    }

    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is facetiming with "+phoneNumber);
    }
    @Override
    public  void calling(long phoneNumber){
        System.out.println(phoneNumber+" calls you on your iPhone");
    }
    @Override
    public  void texting(long phoneNumber){
        System.out.println(phoneNumber+" texted you on your iPhone");
    }

}
