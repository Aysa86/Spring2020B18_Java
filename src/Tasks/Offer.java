package Tasks;

public class Offer {
    /*
    Create a class called Offer that has:
	instance fields :
			location, company, salary , isFullTime
	instance methods :
		setOfferInfo: can set the location, company, salary , isFullTime of the offer
		toString -- return all info about offers
create a class called MyOffers

 */
    String location;
    String company;
    double salary;
    boolean isFullTime;


    public void setOfferInfo(String location, String company, double salary, boolean isFullTime) {
          this.location = location;
          this.company = company;
          this.salary = salary;
          this.isFullTime = isFullTime;
    }
    public String toString(){
        String result = "Location is: "+location+", company is: "+company+", salary is: "+salary+", position is: "+isFullTime;
        return result;
    }

}