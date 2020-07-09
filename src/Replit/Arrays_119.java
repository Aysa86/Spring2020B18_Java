package Replit;
import java.util. Scanner;
public class Arrays_119 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //int k = 0;
        double total = 0;
        //double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
        double length = temps.length;


        for(int k = 0; k<length; k++){
            double eachNum = temps[k];
            total+=eachNum;
        }
        double avgTemp = total/length;
        System.out.println(avgTemp);










    }
}
