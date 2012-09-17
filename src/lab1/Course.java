package lab1;

/**
 *
 * @author sroethle
 */
public abstract class Course {

   private String courseName;
   private String courseNumber;


    public abstract void setCredits(double credits);

    public abstract void setPrerequisites(String prerequisites);
    
    public boolean setCourseNumber(String courseNumber) {
        boolean successfulSet = true;

        if (courseNumber == null || courseNumber.length() == 0) {
            successfulSet = false;
            System.exit(0);
        } else {
            this.courseNumber = courseNumber;
        }
        return successfulSet;
    }
    
    public boolean setCourseName(String courseName) {
        boolean successfulSet = true;
        if (courseName == null || courseName.length() == 0) {
            successfulSet = false;
            System.exit(0);
        }
        this.courseName = courseName;
        return successfulSet;
    }
       
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public final String getCourseName(){
        return courseName;
    }
       
}
