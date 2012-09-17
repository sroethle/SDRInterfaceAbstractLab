package lab2;

/**
 *
 * @author Scott Roethle
 */
public interface Course {
    

    
    public abstract void setCredits(double credits);

    public abstract void setPrerequisites(String prerequisites);
    
    public abstract void setCourseNumber(String courseNumber);
    
    public abstract void setCourseName(String courseName);
    
}
