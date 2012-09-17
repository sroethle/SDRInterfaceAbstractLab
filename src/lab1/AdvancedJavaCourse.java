package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @Scott Roethle     your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course {
    
    
    private double credits;
    private String prerequisites;
    private String errorMessage = "Error: credits must be in the range 0.5 to 4.0";

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getCapitalizedCourseName() {
        return getCourseName().toUpperCase();
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,errorMessage);
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,errorMessage);
            System.exit(0);
        }
        this.setCredits(credits);
    }

    public double getCredits() {
        return credits;
    }
    
}
