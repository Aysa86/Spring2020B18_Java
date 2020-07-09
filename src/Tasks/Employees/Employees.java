package Tasks.Employees;

public abstract class Employees {
    /*
    task02:
    1. create an abstract class named Employees
            private variables: employeeName, employeeId, salary, ssn, JobtiTle, isFullTime, hasPTO
            encapsulate all private variables
            abstract methods: work(), meeting()
            instance Methods: toString()
    2. create an interface named ScrumTeam
            variable: has_ScrumMaster
            abstract methods: dailyStandUp()
    3. create an interface named WorkRemotely
            abstract method: workFromHome();
    4. create a final class named Tester that can inherit Employees, ScrumTeam, and WorkRemotely
            actions: findingBug(), creatingTicket()
    5. create a final class named Developer that can inherit Employees, ScrumTeam, and WorkRemotely
            set a constuctor that can initialize fileds (instance variables)
    6. create a class named AppleInc:
            create 2 Tester' and 3 Developer' objects
            create a list of ScrumTeam and store all Tester's and Developer's objects
            Iterator the list of scrum team to diplay the informations of the full time employees

     */
    private String employeeName;
    private long employeeID;
    private double salary;
    private long SSN;
    private String jobTitle;
    private boolean isFullTime;
    private boolean hasPTO;


    public abstract void work();
    public abstract void meeting();

    public String toString(){
        return "Employee name: "+employeeName+", ID: "+employeeID+", salary: "+salary+", job title: "+jobTitle+
                ", full time: "+isFullTime+", PTO: "+hasPTO;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public boolean isHasPTO() {
        return hasPTO;
    }

    public void setHasPTO(boolean hasPTO) {
        this.hasPTO = hasPTO;
    }


}
