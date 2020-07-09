package day06_Shortland_LogicalOperators;


import java.sql.SQLOutput;

public class LogicalOperators {

    public static void main(String[] args) {


        boolean result1 = true;
        System.out.println(!result1); //false;

        boolean result2 = 10 + 50 > 15; //true

        boolean result3 = !true == !false;
                        //false == true ==> false;
        System.out.println(result3); // false;

        boolean R1 = "Coronavirus" != "End of the world" && "Toilet Paper" == "Cure";
                      //           true                 &&      false ==> false

        boolean R2 = 10> 15 && 15 < 13;
                    // false && false ==> false;

        System.out.println(R1); // false;
        System.out.println(R2); // false;

        boolean R3 = 'a' == 'b' - 1 && 'b' + 1 == 'c';
        //           97 == 98 - 1 && 98 +1 ==99 ==> true

        System.out.println(R3);


        boolean R4 = true != false || false == ! true;
                  // true          || true ==> true;
        System.out.println(R4); //true;

        boolean R5 = true != false && !false == ! true;
                  // true       &&       false ==> false;
        System.out.println(R5); // false


        boolean R6 = !!!false;
                    // !!true
                    // !false
                    // true;



    }


}
