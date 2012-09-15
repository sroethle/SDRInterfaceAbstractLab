package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author sroethle
 */
public abstract class Course {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

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
    
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        setCourseName(courseName);
    }
    
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public final double getCredits() {
        return credits;
    }
    
    public final String getCourseName() {
        return courseName;
    }
    
    public final String getPrerequisites(){
        return prerequisites;
    }
    
}
