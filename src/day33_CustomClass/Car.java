package day33_CustomClass;

public class Car {

    String Brand; // instance variable
    String model;
    int year;                          // ATTRIBUTES OF CAR CLASS
    String color;

    public void StartAction(){                     // 1
        System.out.println(Brand+ " is started"); // AND 5 ACTIONS
    }
    public  void drive(){                        //2
        System.out.println("Driving "+Brand+" "+model);
    }
    public void info(){                           //3
        System.out.println(year+ " "+Brand+ " "+model+" "+color);

    }

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor){// 4
       Brand = carBrand;
       model = carModel;
       year = carYear;
       color = carColor;
    }

    public String toString(){
        String result = year+ " "+Brand+ " "+model+" "+color; //5
        return result;
    }




    public static void main(String[] args) {

        int a = 100;// local variable


    }
}
