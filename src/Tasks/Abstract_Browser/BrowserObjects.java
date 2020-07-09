package Tasks.Abstract_Browser;

import Tasks.Browsers.Opera;

public class BrowserObjects {
    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser("Chrome");
        chrome.get("https://www.google.com");
        chrome.close();
        chrome.maximize();

        FireFoxBrowser firefox = new FireFoxBrowser("FireFox");
        firefox.get("https://cybertekschool.com");
        firefox.close();
        firefox.maximize();


        OperaBrowser opera = new OperaBrowser("Opera");
        opera.get("https://opera.com");
        opera.close();
        opera.maximize();


    }
}
