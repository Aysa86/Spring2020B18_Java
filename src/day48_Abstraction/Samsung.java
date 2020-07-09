package day48_Abstraction;

public class Samsung extends Phone{

    static {
        brand = "Samsung";
    }
    public Samsung( String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println(phoneNumber+" called me yesterday on Samsung");
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println(phoneNumber+" texted me yesterday on Samsung");
    }

    public void downloading(String file){
        System.out.println("Samsung is downloading "+file);
    }

}
