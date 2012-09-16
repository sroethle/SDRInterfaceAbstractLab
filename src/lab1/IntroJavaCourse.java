package lab1;

/**
 * Describe responsibilities here.
 *
 * @Scott Roethle      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course {

    private double credits;
    private String prerequisites;

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
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
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
