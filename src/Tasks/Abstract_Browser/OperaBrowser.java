package Tasks.Abstract_Browser;

public class OperaBrowser extends Browser {

    public OperaBrowser(String browserName){
        this.browserName = browserName;
    }
    public void get(String URL){
        System.out.println(browserName+" is opening "+URL);
    }
    @Override
    public void close(){
        System.out.println(browserName+" is closing");
    }

    public void maximize(){

        System.out.println(browserName+" is maximizing the picture");
    }
}
