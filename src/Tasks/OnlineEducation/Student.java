package Tasks.OnlineEducation;

public class Student implements onlineEducation, Cybertek{
    /*
     3. create an class named Student that can inherit from  onlineEducation and CybertekSchool
            private variables: studentName, age, grade, has_ITBackGround
            encapsulate all private variables
            actions: studying(), takingBreaks(), toString()
     */
    private String studentName;
    private int age;
    private double grade;
    private boolean has_ITBackground;
    @Override
    public void attendClass(){
        System.out.println("Students attend class every day from 10am to 5pm");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isHas_ITBackground() {
        return has_ITBackground;
    }

    public void setHas_ITBackground(boolean has_ITBackground) {
        this.has_ITBackground = has_ITBackground;
    }
    void studying(){
        System.out.println("Student is studying");
    }
    void takingBreaks(){
        System.out.println("Students are taking break every hour");
    }
    public Student(String studentName, int age, double grade,boolean has_ITBackground){
        this.studentName = studentName;
        this.grade = grade;
        this.age = age;
        this.has_ITBackground = has_ITBackground;
    }
    public String toString(){
        return "Name: "+studentName+", age: "+age+", grade: "+grade+", has IT background: "+has_ITBackground;
    }
}

