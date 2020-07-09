package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    /*
    Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer
            2. write a program that can only retain the offers if:
                    1. the offer is for fulltime position
                    2. offer is from your local area
                    3. salary is greater than 100K
     */
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setOfferInfo("AppleINC", "Washington DC", 100000, false);
        //System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setOfferInfo("Bank of America", "Los Angeles", 110000, true);

        Offer offer3 = new Offer();
        offer3.setOfferInfo("Capital One", "Philadelphia", 110000, true);

        Offer offer4 = new Offer();
        offer4.setOfferInfo("Amazon", "San Francisco", 110000, true);





        Offer [] offers = {offer1, offer2, offer3, offer4, };


        ArrayList<Offer> myOffers = new ArrayList<>(Arrays.asList(offers));

       // myOffers.removeIf(p -> ! p.isFullTime);
       // myOffers.removeIf(p -> p.salary < 100000);
       // myOffers.removeIf(p -> ! p.location.equals("Philadelphia"));
        myOffers.removeIf(p -> p.salary <= 100000 ||  ! p.isFullTime || ! p.location.equalsIgnoreCase("Philadelphia"));

        System.out.println(myOffers.size());
        for(Offer eachOffer : myOffers){
            System.out.println(eachOffer);
        }




    }
}
