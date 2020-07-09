package day47_Abstraction;

public class IEDriver extends RemoteWebDriver {
    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" in IE browser");
    }

    @Override
    public void quit() {
        System.out.println("Closing IE browser");
    }
}
