package Replit;
import javax.jws.soap.SOAPBinding;
import java.util.*;
public class Color {
    /*
    Available colors are already initialized to static final arrays.

We will practice :
overloading constructors
this() keyword
comparing arrays
overriding toString method
     */
    //rgb array with 3 ints is used to hold r,g,b values
    private int[] rgb = new int[3];

    /**
     * Available colors - ready with rgb code
     */

    public final static int[] WHITE     = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY      = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
    public final static int[] BLACK     = new int[]{0, 0, 0};
    public final static int[] RED       = new int[]{255, 0, 0};
    public final static int[] PINK      = new int[]{255, 175, 175};
    public final static int[] ORANGE    = new int[]{255, 200, 0};
    public final static int[] YELLOW    = new int[]{255, 255, 0};
    public final static int[] GREEN     = new int[]{0, 255, 0};
    public final static int[] MAGENTA   = new int[]{255, 0, 255};
    public final static int[] CYAN      = new int[]{0, 255, 255};
    public final static int[] BLUE      = new int[]{0, 0, 255};


    /**
     * Public constructor accepts 3 ints that represent color code.
     * assign 3 int parameters to rgb array indexes(0,1,2)
     * @param r
     * @param g
     * @param b
     */
    public Color(int r, int g, int b){
      this.rgb[0] = r;
      this.rgb[1] = g;
      this.rgb[2] = b;
        //TODO
    }

    /**
     * Public no- args constructor: sets default color as "white" (255,255,255)
     * try to use this() keyword to call above constructor to set white color
     */
    public Color() {
        //TODO
        this(255,255,255);
    }

    /**
     * Override toString(from Object class).
     * Provides string description of the color like "red" ,"blue" based on
     * rgb value.
     * Compare value of rgb array with static color code arrays
     * and find out what color it is. Arrays.equals(arr1,arr2) is easiest way
     * to compare 2 int arrays
     * @returns a String color name like
     * "white" or "blue"
     * If rgb values does not match any available combinations, return "n/a"
     *
     * Ex:
     * Color color = new Color();
     * System.out.println(color.toString() ) ; // prints "white"
     *
     * Color color = new Color(255, 0, 0);
     * System.out.println(color.toString() ) ; // prints "red"
     *
     * Color color4 = new Color(192, 192, 192);
    System.out.println(color4 ) ; // prints "light gray"
     */
    public String toString() {
//String colors = "";
if(Arrays.equals(rgb,WHITE)){
    //System.out.println("white");
    return "white";
}else if(Arrays.equals(rgb, LIGHT_GRAY)){
    System.out.println("light gray");
}else if(Arrays.equals(rgb, GRAY)){
    System.out.println("gray");
}else if(Arrays.equals(rgb, DARK_GRAY)){
    System.out.println("dark gray");
}else if(Arrays.equals(rgb, BLACK)){
    System.out.println("black");
}else if(Arrays.equals(rgb,RED)){
    System.out.println("red");
}else if(Arrays.equals(rgb, PINK)){
    System.out.println("pink");
}else if(Arrays.equals(rgb,ORANGE)){
    System.out.println("orange");
}else if(Arrays.equals(rgb, YELLOW)){
    System.out.println("yellow");
}else if(Arrays.equals(rgb,GREEN)){
    System.out.println("green");
}else if(Arrays.equals(rgb, MAGENTA)){
    System.out.println("magenta");
}else if(Arrays.equals(rgb, CYAN)){
    System.out.println("cyan");
}else if(Arrays.equals(rgb, BLUE)){
    System.out.println("blue");
}else{
    System.out.println("n/a");
}

        //TODO

        return  null;//colors; //change this to return colors
    }

    public static void main(String[] args) {


            Color color = new Color();
            System.out.println(color.toString() ) ; // prints "white"

            Color color2 = new Color(255, 0, 0);
            System.out.println(color2.toString() ) ; // prints "red"

            Color color3 = new Color(255, 44, 88);
            System.out.println(color3.toString() ) ; // prints "n/a"

            Color color4 = new Color(192, 192, 192);
            System.out.println(color4 ) ; // prints "light gray"
        }



    }






