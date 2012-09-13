package lab1;

/**
 *
 * @author sroethle
 */
public abstract class Course {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public abstract void setCourseName();

    public abstract void setCourseNumber();
    
    public abstract void setCredits(double credits);
    
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public double getCredits() {
        return credits;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public String getPrerequisites(){
        return prerequisites;
    }
    
}
