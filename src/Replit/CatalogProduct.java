package Replit;
import java.util.ArrayList;
import java.util.Arrays;

public class CatalogProduct {

    public ArrayList<String> items = new ArrayList<>();
    public ArrayList<Double> prices = new ArrayList<>();
    public ArrayList<Double> monthlyPayments = new ArrayList<>();


    public void loadItems() {

items.addAll(Arrays.asList("iPhone 6s", "iPhone 6s Plus", "iPhone X", "MacbookPro", "ThumbDrive", "Beats HeadPhones",
        "Mouse", "Charger", "iPad", "Dyson Vacuum", "TV", "Apple Watch") );

    }

    public void loadPrices() {

prices.addAll(Arrays.asList(449.0, 549.0, 1149.0, 1499.0, 39.99, 349.99, 79.99, 39.99, 429.0, 399.0, 2199.0, 559.0));

    }


    public void loadMonthlyPayments() {

monthlyPayments.addAll(Arrays.asList(18.71, 22.88, 56.16, 79.49, 2.68, 15.12, 8.98, 4.56, 18.31, 16.25, 89.49, 21.18));

    }


    public void loadWholeCatalog() {

      loadItems();
      loadPrices();
      loadMonthlyPayments();
    }

    /**
     do not change the method below
     */
    public StringBuilder getWholeCatalog() {
        loadWholeCatalog();
        StringBuilder str = new StringBuilder();
        for (int i=0; i<items.size(); i++) {
            str.append(items.get(i)+"-"+prices.get(i)+ "-" +monthlyPayments.get(i)+"\n");
        }
        return str;
    }



    public String getItemDetails(String item) {
        //LOAD WHOLE CATALOG HERE FIRST:
        loadWholeCatalog();

      for(int a = 0; a < items.size(); a++){
          if(item.equalsIgnoreCase(items.get(a))){
              return items.get(a)+"-"+prices.get(a)+"-"+monthlyPayments.get(a);
          }
      }

        return null;
    }


    public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {
        //LOAD WHOLE CATALOG HERE FIRST
        loadWholeCatalog();
        //TODO
        ArrayList<String> list = new ArrayList<>();
        for(int b = 0; b < monthlyPayments.size(); b++){
            if(monthlyPayments.get(b) <= price){
                list.add(items.get(b) + "-"+prices.get(b)+"-"+monthlyPayments.get(b));
            }
        }
        return list;

    }



    public void updatePrice(String item, double newPrice) {
        //LOAD WHOLE CATALOG HERE FIRST
        loadWholeCatalog();
        //TODO
       for(int c = 0; c < items.size(); c ++){
           if(items.get(c).equalsIgnoreCase(item)){
               prices.set(c,newPrice);
               monthlyPayments.set(c, newPrice/12);
           }
       }
    }


    public void deleteItemFromCatalog(String item) {
        //LOAD WHOLE CATALOG HERE FIRST
loadWholeCatalog();
        //TODO
        for(int d = 0; d < items.size(); d++){
            if(items.get(d).equalsIgnoreCase(item)){
                items.remove(d);
                prices.remove(d);
                monthlyPayments.remove(d);
            }
        }
    }


    public static void main(String[] args) {
        CatalogProduct ctl = new CatalogProduct();
        ctl.loadItems();
        ctl.loadPrices();
        ctl.loadMonthlyPayments();

        System.out.println(ctl.items.toString());
        System.out.println(ctl.prices.toString());
        System.out.println(ctl.monthlyPayments.toString());

        CatalogProduct ctl2 = new CatalogProduct();
        ctl2.loadWholeCatalog();
        System.out.println(ctl2.getWholeCatalog().toString().trim());

    }


}
