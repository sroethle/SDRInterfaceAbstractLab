/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Scotty
 */
public class StartUp {
    public static void main(String[] args) {


        lab1.IntroToProgrammingCourse p =
                new lab1.IntroToProgrammingCourse("Course", "105");
        lab1.Course[] courses = {
            new lab1.IntroToProgrammingCourse("Intro to Programming", "10052"), 
            new lab1.IntroJavaCourse("Intro To Java", "4664"),
            new lab1.AdvancedJavaCourse("Advanced Java", "1561")};

        for (lab1.Course a : courses) {
            System.out.println(a.getCourseName());
        }

    }
}
