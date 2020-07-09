package day47_Abstraction;

import Tasks.Browsers.Opera;

public class DriverObjects {
    public static void main(String[] args) {

        ChromeDriver chrome = new ChromeDriver();
        chrome.get("https://www.google.com");
        chrome.quit();

        System.out.println("==================================");

        FifeFoxDriver fireFox = new FifeFoxDriver();
        fireFox.get("https://facebook.com");
        fireFox.quit();

        System.out.println("==================================");

        OperaDriver opera = new OperaDriver();
        opera.get("https://www.instagram.com");
        opera.quit();

        System.out.println("==================================");

        EdgeDriver edge = new EdgeDriver();
        edge.get("https://www.vk.com");
        edge.quit();

        System.out.println("==================================");

        SafariDriver safari = new SafariDriver();
        safari.get("https://www.cybertekschool.com");
        safari.quit();

        System.out.println("==================================");

        IEDriver ie = new IEDriver();
        ie.get("https://www.mail.ru");
        ie.quit();




    }
}
