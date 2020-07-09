package Tasks.Abstract_Browser;

public class ChromeBrowser extends Browser{
    /*
    2. creata three sub classes of Browser:
                                1. ChromeBrowser
                                2. FireFoxBrowser
                                3. OperaBrowser
                        each class MUST have constructors to initialize the attributes
                    each actions should ONLY be applicable to the object it's called from
                    Ex:
                        chrome.get("https://www.google.com")
                        output should be: chrome browse is opening https://www.google.com
                                    (it should not open the URL in different browser other than chrome)

     */

    public ChromeBrowser(String browserName){
        this.browserName = browserName;
    }
    @Override
    public void get(String URL){
        System.out.println(browserName+" is opening "+URL);
    }
    public void close(){
        System.out.println(browserName+" is closing");
    }

    public void maximize(){

        System.out.println(browserName+" is maximizing the picture");
    }
}
