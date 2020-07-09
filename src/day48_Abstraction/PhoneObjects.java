package day48_Abstraction;

public class PhoneObjects {
    public static void main(String[] args) {

        iPhone iphone = new iPhone("X Max", 1000, "15 inches");
        System.out.println(iphone);
        iphone.calling(123456789);
        iphone.texting(987652346);
        iphone.faceTiming(537298754);

        System.out.println("====================================");

        Samsung samsung = new Samsung("C123", 1000, "10 inches");
        System.out.println(samsung);
        samsung.calling(654327633);
        samsung.texting(127846790);
        samsung.downloading("image");



    }
}
