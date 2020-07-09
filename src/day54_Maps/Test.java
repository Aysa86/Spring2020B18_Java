package day54_Maps;

public class Test {
    public static void main(String[] args) {

        Color myFavoriteColor = Color.Yellow; // can't assign to color that didn't create
        Color myFavoriteColor2 = Color.Red;
        Color myFavoriteColor3 = Color.Green;

        System.out.println(myFavoriteColor); // Yellow

        System.out.println("=====================================");

        Browsers browserName1 = Browsers.Chrome;
        Browsers browserName2 = Browsers.FireFox;
        Browsers browserName3 = Browsers.Safari;
        
        System.out.println(browserName1);
        System.out.println(browserName2);
        System.out.println(browserName3);
    }
}
