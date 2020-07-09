package Replit;
import java.util.*;
public class Stock {
    // DO NOT CHANGE THE METHOD BELOW
    public void adjustPrice(int value){
        int temp=price;
        price=price+(value);
        percentChange=((double)(price-temp))/temp;
        marketCap=totalShares*price;
    }

    String tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int totalShares;
    long marketCap;

    public Stock(String tickerSymbol, String companyName, int price, int totalShares){
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;

    }

    public long marketCap(){
      return   totalShares*price;
    }

/*
public void adjustPrice(int value)
This method will change the price by value (value can be positive or negative).
 It should also recalculate percentChange and marketCap.
 percentChange represents the percentage changed

public String toString()
This method should return a SINGLE String (using \n) that represents something like the following:
Ticker Symbol: GOOG
Company: Google, Inc.
Current Price: $802 (+7.2%)
Market Cap: $538000000000
 */

   public String toString(){
       return "Ticker Symbol: "+tickerSymbol+"\nCompany: "+companyName+"\nCurrent price: $"+price+
               "\nMarket Cap: $"+marketCap();
   }

    public static void main(String[] args) {

       Stock st1 = new Stock("A", "Apple", 10000, 20);
        System.out.println(st1);

    }


}





