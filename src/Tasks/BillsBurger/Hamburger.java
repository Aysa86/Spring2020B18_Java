package Tasks.BillsBurger;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRoll;

    private String additionalName1;
    private double additionalPrice1;

    private String additionalName2;
    private double additionalPrice2;

    private String additionalName3;
    private double additionalPrice3;

    private String additionalName4;
    private double additionalPrice4;


    public Hamburger(String name, String meat, double price, String breadRoll) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoll = breadRoll;
    }
    public void addHamburgerAddition1(String name, double price){
        this.additionalName1 = name;
        this.additionalPrice1 = price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.additionalName2 = name;
        this.additionalPrice2= price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.additionalName3 = name;
        this.additionalPrice3 = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.additionalName4 = name;
        this.additionalPrice4 = price;
    }


}
