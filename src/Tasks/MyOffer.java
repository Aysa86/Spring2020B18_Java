package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {
        /*
        Create 5 offer objects, and add them into the list of offers, and then:
			1. use for loop to print out the info of each offer
			2. write a program that can only retain the offers if:
					1. the offer is for fulltime position
					2. offer is from your local area
					3. salary is greater than 100K
         */

        Offer offer1 = new Offer();
        offer1.setOfferInfo("PA", "Apple", 100000, true);
        System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setOfferInfo("Washington DC", "Bank of America", 120000, true);
        System.out.println(offer2);

        Offer offer3 = new Offer();
        offer3.setOfferInfo("VA", "Capital One", 110000, false);
        System.out.println(offer3);

        Offer offer4 = new Offer();
        offer4.setOfferInfo("NY", "Chase", 110000, true);
        System.out.println(offer4);

        Offer offer5 = new Offer();
        offer5.setOfferInfo("KY", "KFC", 100000, false);
        System.out.println(offer5);

        System.out.println("=================================================================");

        ArrayList<Offer> OfferList = new ArrayList<>();
        OfferList.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5));


        for(int a = 0; a < OfferList.size(); a++){
            System.out.println(OfferList.get(a));
        }

        System.out.println("===================================================");

        ArrayList<Offer> fullTime = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5));
        fullTime.removeIf(p ->  ! p.isFullTime);
        System.out.println(fullTime);


        System.out.println("=======================================================");

        ArrayList<Offer> localArea = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5));
        localArea.removeIf(p ->  ! p.location.contains("PA"));
        System.out.println(localArea);

        System.out.println("========================================================");

        ArrayList<Offer> salary = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5));
        salary.removeIf(p -> p.salary < 100000);
        System.out.println(salary);


    }
}
