package day14_StringClass;

public class WebAddress {
    public static void main(String[] args) {
/*
write a programm that can validate if a web address is valid
valid web addresses:
must start with www.
must ends with .com, .edu, .net, .gov
 */
        String webSite = "WWW.cybertek.Gov";
        webSite = webSite.toLowerCase();

        boolean validEnding = webSite.endsWith(".com") || webSite.endsWith(".edu") || webSite.endsWith(".net") || webSite.endsWith(".gov");
        if(webSite.startsWith("www.") && validEnding) {
            System.out.println("Valid address");
        }else{
            System.out.println("Invalid address");
        }
    }
}
