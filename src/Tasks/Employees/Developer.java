package Tasks.Employees;

public final class Developer extends Employees implements ScrumTeam, workRemotely{
    /*
     5. create a final class named Developer that can inherit Employees, ScrumTeam, and WorkRemotely
            set a constuctor that can initialize fileds (instance variables)
     */
    public Developer(String employeeName,long employeeID,double salary,long SSN,
                     String jobTitle,boolean isFullTime,boolean hasPTO ){
        setSalary(salary);
        setEmployeeName(employeeName);
        setEmployeeID(employeeID);
        setSSN(SSN);
        setJobTitle(jobTitle);
        setFullTime(isFullTime);
        setHasPTO(hasPTO);
    }
    @Override
    public void work(){
        System.out.println("Developers are working");
    }
    @Override
    public void meeting(){
        System.out.println("Developers have around 5 meetings every 2 weeks");
    }
    @Override
    public void workFromHome(){
        System.out.println("3 Developers work from home");
    }
    @Override
    public void dailyStandUp(){
        System.out.println("Developers have daily stand up meeting every day");
    }
}
