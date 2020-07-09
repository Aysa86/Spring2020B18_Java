package day44_Exceptions;



public class Browsers {
     /*
    warmup task:
    1. create a class called Browsers
            actions: openBrowser():prints "opens the default browser"
                     closeBrowser(): closes the default browser
    2. create a class called ChromeBrowser
            actions: openBrowser(): opens the chrome browser
                     closeBrowser(): closes the chrome browser
    3. creata a class called FirefoxBrowser
            actions: openBrowser(): opens the Firefox browser
                     closeBrowser(): closes the Firefox browser
    4. create a class called Opera browser
            actions: openBrowser(): opens the Opera browser
                     closeBrowser(): closes the Opera browser
    5. create a class called Test:
            create an object of each browsers and call the openBrowser & closeBrowser actions*/

    public void openBrowser() {
        System.out.println("Opens the default browser");
    }

    public void closeBrowser() {
        System.out.println("Closes the default browser");
    }

    class ChromeBrowser extends Browsers {
@Override
        public void openBrowser() {
            System.out.println("Opens Chrome browser");
        }

        public void closeBrowser() {
            System.out.println("Closes Chrome browser");
        }

    }

    class FireFoxBrowser extends Browsers {
@Override
        public void openBrowser() {
            System.out.println("Opens Firefox browser");
        }

        public void closeBrowser() {
            System.out.println("Closes Firefox browser");
        }
    }

    class Opera extends Browsers {
@Override
        public void openBrowser() {
            System.out.println("Opens Opera browser");
        }

        public void closeBrowser() {
            System.out.println("Closes Opera browser");
        }
    }
}

class Test{
          public static void main(String[] args) {

              Browsers browser = new Browsers();
              browser.openBrowser();
              browser.closeBrowser();

              System.out.println("==============================================");

              Tasks.Browsers.Opera opera = new Tasks.Browsers.Opera();
              opera.openBrowser();
              opera.closeBrowser();

              System.out.println("================================================");

              Tasks.Browsers.FireFoxBrowser firefox = new Tasks.Browsers.FireFoxBrowser();
              firefox.openBrowser();
              firefox.closeBrowser();

              System.out.println("=================================================");

              Tasks.Browsers.ChromeBrowser chrome = new Tasks.Browsers.ChromeBrowser();
              chrome.openBrowser();
              chrome.closeBrowser();


          }


      }






