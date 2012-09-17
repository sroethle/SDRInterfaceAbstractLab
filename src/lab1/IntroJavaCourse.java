package lab1;

/**
 * Describe responsibilities here.
 *
 * @Scott Roethle 
 * @version     1.00
 */
public class IntroJavaCourse extends Course {

    private double credits;
    private String prerequisites;
    private String errorMessage = "Error: credits must be in the range 0.5 to 4.0";

    public IntroJavaCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

    public void setPrerequisites(String prerequisites) {
        //perform validation
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            System.out.println(errorMessage);
            System.exit(0);
        }
        this.credits = credits;
    }

    public final double getCredits() {
        return credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

}
