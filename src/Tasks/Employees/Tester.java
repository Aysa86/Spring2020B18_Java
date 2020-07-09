package Tasks.Employees;

public final class Tester extends Employees implements ScrumTeam, workRemotely{
    /*
    4. create a final class named Tester that can inherit Employees, ScrumTeam, and WorkRemotely
            actions: findingBug(), creatingTicket()
     */
    public Tester(String employeeName,long employeeID,double salary,long SSN,
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
        System.out.println("Testers are working");
    }
    @Override
    public void meeting(){
        System.out.println("Testers have around 5 meetings every 2 weeks");
    }
    @Override
    public void workFromHome(){
        System.out.println("2 testers work from home");
    }
    @Override
    public void dailyStandUp(){
        System.out.println("Testers have daily stand up meeting every day");
    }
    public void findingBug(){
        System.out.println("Testers have to find bugs");
    }
    public void creatingTicket(){
        System.out.println("If tester found a bug he hes to write a ticket");
    }
}
