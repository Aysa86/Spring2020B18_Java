package day47_Abstraction;

public class EdgeDriver extends RemoteWebDriver {
    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" in Edge browser");
    }

    @Override
    public void quit() {
        System.out.println("Closing Edge browser");
    }
}
