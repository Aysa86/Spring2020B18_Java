package Tasks.BillsBurger;

public class HealthyBurger extends Hamburger{

    private String healthyExtraName1;
    private double healthyExtraPrice1;

    private String healthyExtraName2;
    private double healthyExtraPrice2;


    public HealthyBurger(String meat, double price){
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtraName1 = name;
        this.healthyExtraPrice1 = price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtraName2 = name;
        this.healthyExtraPrice2 = price;
    }
    

}
