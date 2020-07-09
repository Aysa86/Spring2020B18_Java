package Tasks.Downloadable;

public class PhoneObjects {
    public static void main(String[] args) {

        iPhone iphone = new iPhone("X Max", 1000, "10 inches");
        System.out.println(iphone);
        iphone.texting(12345);
        iphone.calling(87654);
        iphone.download();
        iphone.faceTiming(87652);
        iphone.selfie();

        System.out.println("===================================================");

        Nokia nokia = new Nokia("BYF", 1000, "8 inches");
        System.out.println(nokia);
        nokia.texting(98076);
        nokia.breakTheFloor();
        nokia.calling(74398);
        nokia.download();
        nokia.freezing();
    }
}
