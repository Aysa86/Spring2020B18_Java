package day40_Encapsulation;

public class Encapsulation {

   private long SSN;

   // to read SSN data, use getter, returns private data

    public long getSSN(){// for reading only
        return SSN;
    }
    // setter : write only, to initialize SSN number

    public void setSSN(long SSN){
        this.SSN = SSN;
    }



}
