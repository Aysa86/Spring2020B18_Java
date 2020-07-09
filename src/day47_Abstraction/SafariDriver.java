package day47_Abstraction;

public class SafariDriver extends RemoteWebDriver {
    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" in safari browser");
    }

    @Override
    public void quit() {
        System.out.println("Closing Safari browser");
    }
}
