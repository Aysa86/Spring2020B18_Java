package day25_MethodsRecap;

public class Driver {
    /* method declaration
    Access-modifier  Specifier return-type methodType(parameter){
             statements;
    }
     */
    /*
    1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "ie", "safari", "edge", "Opera"},
				then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above,
				the method should return "Invalid"
				APPLY SWITCH STATEMENTS
		2. do the first task with multi-branch if statement instead of switch statement
	    3. do the first task with ternaries instead of switch statements

     */

    public static void main(String[] args) {
       String str1 =  getDriver1("sAfArI");
        System.out.println(str1);

        String str2 = getDriver2("opera");
        System.out.println(str2);

        String str3 = getDriver3("FireFOx");
        System.out.println(str3);
    }




    public static String getDriver1(String browserName){
        String result = "";// no need for "result"
        switch(browserName.toLowerCase()){
            case "chrome": result= "Chrome Driver"; //'return' instead of 'result'
                     break; // no need for "break"
            case "firefox": result = "Firefox Driver";
                     break;
            case "internet explorer": result = "Internet Explorer Driver";
                     break;
            case "safari" : result = "Safari Driver";
                     break;
            case "opera" : result = "Opera Driver";
                     break;
            case "edge" : result = "Edge Driver";
                     break;
            default: result = "Invalid Driver";

        }





        return result;// no need
    }

    public static String getDriver2(String browserName){
        browserName = browserName.toLowerCase();
        String result = "";
        if(browserName.equals("chrome")){
            result = "Chrome Driver";             // return "Chrome Driver";
        }else if(browserName.equals("firefox")){
            result = "Firefox Driver";            // return "Firefox Driver";
        }else if(browserName.equals("safari")){
            result = "Safari Driver";              // ...
        }else if(browserName.equals("edge")){
            result = "Edge Driver";               // ...
        }else if(browserName.equals("opera")){
            result = "Opera Driver";             // ...
        }else{
            result = "Invalid Driver";           // return "Invalid Driver";
        }


        return result;                          // no need for "return result",
    }

    public static String getDriver3(String browserName){
        browserName = browserName.toLowerCase();
        String result = (browserName.equals("chrome")) ? "Crome Driver" :// 'return' instead of 'result'
                       (browserName.equals("firefox")) ? "Firefox Driver" :
                               (browserName.equals("safari")) ? "Safari Driver" :
                                       (browserName.equals("edge")) ? "Edge Driver" :
                                       (browserName.equals("opera")) ? "Opera Driver" : "Invalid Driver";





        return result;
    }


}
