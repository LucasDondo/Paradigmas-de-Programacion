package fiuba;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private final int id;
    public final Map<String, Degree> degrees;
    public final Map<String, Course> approvedCourses;

    public Student(int id){
        this.id = id;
        degrees = new HashMap<>();
        approvedCourses = new HashMap<>();
    }

    public void enrollOnDegree(Degree degree){
        degrees.put(degree.id, degree);
    }

    public void markCourseAsApproved(){
        System.out.println("Courses to be marked as approved:");
        degrees.forEach((degreeID, degree)->{
            System.out.println("\n- " + degree.name);
            degree.courses.forEach((courseID, course)->{
                if (!approvedCourses.containsKey(courseID)){
                    System.out.println("- - " + course);
                }
            });
        });

        System.out.println("\nWhich course do you want to mark as approved?");
        String courseID = System.console().readLine();

        for (Degree degree : degrees.values()){
            if (degree.courses.containsKey(courseID)){
                approvedCourses.putIfAbsent(courseID, degree.courses.get(courseID));
            }
        }
    }

    public void showProgress(){
        degrees.forEach((degreeID, degree)->{
            final int[] qObligatoryCourses = {0};
            final int[] qObligatoryCoursesApproved = {0};
            final int[] qOptionalCoursesCreditsApproved = {0};

            degree.courses.forEach((courseID, course)->{
                if (course.obligatory){
                    qObligatoryCourses[0] += 1;
                    if (approvedCourses.containsKey(courseID)){
                        qObligatoryCoursesApproved[0] += 1;
                    }
                } else {
                    if (approvedCourses.containsKey(courseID)){
                        qOptionalCoursesCreditsApproved[0] += course.credits;
                    }
                }
            });
            
            System.out.println("\n" + degree.name);   
            System.out.println("- Obligatory courses approved: " + qObligatoryCoursesApproved[0] + "/" + qObligatoryCourses[0]);
            System.out.println("- Optional credits approved: " + qOptionalCoursesCreditsApproved[0] + "/" + degree.minOptionalCredits);
        });
    }
}
