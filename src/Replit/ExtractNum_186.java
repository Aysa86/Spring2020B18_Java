package Replit;

public class ExtractNum_186 {
    public static String extractNum(String s) {
        String ss="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                ss+=s.charAt(i);
            }
        }
        return ss;
    }

    public static void main(String[] args) {
        String s = "eh1na7";
        System.out.println(extractNum(s));
    }
}
