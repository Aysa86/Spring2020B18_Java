package day40_Encapsulation;

public class EmployeeInfo {

    public static String companyName = "Cybertek";

    private double salary;
    private long SSN;
    private int ID;
    private String address;



    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public long getSSN(){
        return SSN;
    }

    public void setSSN(long SSN){
        this.SSN = SSN;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

}
