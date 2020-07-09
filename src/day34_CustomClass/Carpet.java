package day34_CustomClass;

public class Carpet {
    /*
    1. create a custom class for the carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet= (width*length)*unitprice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
            create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets
                    use for each loop to print out all the persian carpets
     */

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calcCost(){
        double total = (width+length)*unitPrice;
        if(isPersian){
           return total+=200;
        }else{
            return total;
        }
       // return (isPersian) ? total+200 : total;
    }

    public void customOrder(double CarpetWidth, double CarpetLength, double CarpetUnitPrice, boolean CarpetPersian){
      width = CarpetWidth;
      length = CarpetLength;
      unitPrice = CarpetUnitPrice;
      isPersian = CarpetPersian;
    }

    public String toString(){
        String result = "width: "+width+"\nlength: "+length+"\nunit price: $ "+unitPrice+"\ncosts: $ "+calcCost();
       return result;
    }


}
