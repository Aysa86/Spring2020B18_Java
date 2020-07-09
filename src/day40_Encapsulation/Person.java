package day40_Encapsulation;

public class Person {

   private long SSN;
   private int ID;

   public String name;


   public Person(String name){
      this.name = name;
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

   public  void setSSNandID(long SSN, int ID){
      this.SSN = SSN; // setSSN(SSN)
      this.ID = ID;//   setID(ID)
   }



}
