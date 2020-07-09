package Tasks.Downloadable;

public final class iPhone extends Phone implements AppleApps {
    /*
    4. create a class named iPhone that can inherit from AppleApps interface
            actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
     */

    static {
        brand = "Apple";
    }
    public iPhone(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public  void texting(long phoneNumber){
        System.out.println(phoneNumber+" is texting me on iPhone");
    }
    public void calling(long phoneNumber){
        System.out.println(phoneNumber+ " is calling me on iPhone");
    }
    public void download(){
        System.out.println("I'm download applications from "+appStoreName+" for my iPhone");
    }
    public void faceTiming(long phoneNumber){
        System.out.println("I'm facetiming with "+phoneNumber+" using my iPhone ");
    }
    public void selfie(){
        System.out.println("I'm doing selfie using my iPhone");
    }
}
