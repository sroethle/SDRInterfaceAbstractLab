/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


/**
 *
 * @author Scott Roethle
 */
public class StartUp {
    public static void main(String[] args) {
        

        IntroToProgrammingCourse p = 
                new IntroToProgrammingCourse("Course", "105");
        Course[] courses = { new IntroToProgrammingCourse("Intro to Programming"
                , "10052"), new IntroJavaCourse("Intro To Java", "4664"), 
                new AdvancedJavaCourse("Advanced Java", "1561") };

         for(Course a : courses) {
             System.out.println(a.getCourseName());
        }
        
    }
    
}
