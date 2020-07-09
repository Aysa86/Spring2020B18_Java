package Replit;
import java.util.Scanner;
public class ShoppingList_030 {



        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:

            Scanner scan = new Scanner(System.in);


            System.out.println("Enter Item1, count and it's price:");
            String item1 = scan.nextLine();
            double price1 = scan.nextDouble();
            int count1 = scan.nextInt();

            scan.nextLine();
            System.out.println("Enter Item2, count and it's price:");
            String item2 = scan.nextLine();
            double price2 = scan.nextDouble();
            int count2 = scan.nextInt();

            scan.nextLine();
            System.out.println("Enter Item3, count and it's price:");
            String item3 = scan.nextLine();
            double price3 = scan.nextDouble();
            int count3 = scan.nextInt();

             String report = " ";
             double totalPrice =(count1*price1)+(count2*price2)+(count3*price3);
            if(count1>0) {
                report +="Item1: "+item1+" Price: "+price1*count1+",";
                totalPrice +=price1*count1;
            }if (count2>0){
                report +=" Item2: "+item2+" Price: "+price2*count2;
                totalPrice +=price2*count2;
            }if (count3>0){
                report +=" Item3: "+item3+" Price: "+price3*count3;
                totalPrice +=price3*count3;
            }else {
            }
            System.out.println(report);
            System.out.println("Total price: "+totalPrice);





        }
    }

