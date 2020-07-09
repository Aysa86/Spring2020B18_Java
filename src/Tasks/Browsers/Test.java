package Tasks.Browsers;

public class Test {
    /*5. create a class called Test:
            create an object of each browsers and call the openBrowser & closeBrowser actions*/
    public static void main(String[] args) {

        Browser browser = new Browser();
        browser.closeBrowser();
        browser.openBrowser();

        System.out.println("==============================================");

        Opera opera = new Opera();
        opera.closeBrowser();
        opera.openBrowser();

        System.out.println("================================================");

        FireFoxBrowser firefox = new FireFoxBrowser();
        firefox.closeBrowser();
        firefox.openBrowser();

        System.out.println("=================================================");

        ChromeBrowser chrome = new ChromeBrowser();
        chrome.openBrowser();
        chrome.closeBrowser();



    }







}
