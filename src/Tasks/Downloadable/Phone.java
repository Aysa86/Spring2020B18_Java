package Tasks.Downloadable;

public abstract class Phone {
    /*
    3. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()
     */
    public static String brand; // in abstract class we need to give public
    public String model;
    public double price;
    public String size;

    public abstract void texting(long phoneNumber);

    public abstract void calling(long phoneNumber);

    public String toString(){
        return "Brand: "+brand+", model: "+model+", price: "+price+", size: "+size;
    }
}
