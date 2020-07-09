package Replit;

/*
 Write four constructors:
* The default constructor
* A secondary constructor that does not have a category or an expiration (category defaults to "misc",
 hasExpiration defaults to false)
* A secondary constructor that does not have a category, expiration, or stock (stock defaults to 0)
* A secondary constructor that just does not have stock

2. Test your code with the Main.java class:
Create several StoreProduct objects using all Constructors and print their fields/states to make sure it's correct.

3. Include the following methods:


* public boolean sale(int quantity)
Check if the quantity (being bought) is available given the stock.  If there is enough, then make the sale by subtracting the quantity from the stock and return true (the sale was successful).  If there isn't enough, return false instead.

* public double getDiscountedPrice(double discount)
The parameter discount should be between .01 and 1 and represent a 0 to 100% discount.  Multiply the product's price by the (1 - discount) and return that number.
 */

public class StoreProduct {
    String label;
    int price;
    String category = "misc";
    boolean hasExpiration = false;
    int stock = 0;

    public StoreProduct(){

    }
    public StoreProduct(String label, int price, boolean hasExpiration, int stock){
        this.label = label;
        this.price = price;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }
    public StoreProduct(String label, int price, String category, int stock){
        this.label = label;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }
    public StoreProduct(String label, int price, String category, boolean hasExpiration){
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
    }

    /*
    * public void expired(boolean hasExpired)
If the product has an expiration date and hasExpired is true, then it should set the stock to 0.  Otherwise, nothing happens.

     */
    public void expired(boolean hasExpiration){
       if(hasExpiration == true ){
          this.stock = 0;
       }
    }

    /*
    * public boolean sale(int quantity)
Check if the quantity (being bought) is available given the stock.
* If there is enough, then make the sale by subtracting the quantity
* from the stock and return true (the sale was successful).  If there isn't enough, return false instead.

     */
    public boolean sale(int quantity){
if(this.stock >= quantity){
    this.stock-=quantity;
    return true;
}
return false;
    }

    public double getDiscountedPrice(double discount){
        return this.price*(1 - discount);
    }


}
