package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course {
    
    private double credits;
    private String prerequisites;
    private String errorMessage = "Error: credits must be in the range 0.5 to 4.0";

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }
    /**
     *
     * @param credits
     */
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,errorMessage);
            
        }else{
            this.credits = credits;
        }
        
        
    }
    
   
    public void setPrerequisites(String prerequisites) {
        //perform validation
        this.prerequisites = prerequisites;
    }

    public double getCredits() {
        return credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }
    
    
    
}
