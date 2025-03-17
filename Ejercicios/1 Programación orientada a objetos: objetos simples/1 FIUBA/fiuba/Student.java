package fiuba;

import java.util.HashMap;

public class Student {
    private final Integer id;
    private HashMap<String, Degree> degrees;
    private HashMap<String, Course> approvedCourses;

    public Student(Integer id){
        this.id = id;
        this.degrees = new HashMap<>();
        this.approvedCourses = new HashMap<>();
    }

    public void markCourseAsApproved(String id){
        for (Degree degree : this.degrees.values()){
            if (degree.courses.containsKey(id)){
                this.approvedCourses.putIfAbsent(id, degree.courses.get(id));
                return;
            }
        }
    }

    public void showProgress(){
        this.degrees.forEach((degreeID, degree)->{
            final int[] qObligatoryCourses = {0};
            final int[] qObligatoryCoursesApproved = {0};
            final int[] qOptionalCoursesCreditsApproved = {0};

            degree.courses.forEach((courseID, course)->{
                if (course.obligatory){
                    qObligatoryCourses[0] += 1;
                    if (this.approvedCourses.containsKey(courseID)){
                        qObligatoryCoursesApproved[0] += 1;
                    }
                } else {
                    if (this.approvedCourses.containsKey(courseID)){
                        qOptionalCoursesCreditsApproved[0] += course.credits;
                    }
                }
            });
            
            System.out.println("Degree: " + degree.name);   
            System.out.println("Obligatory courses approved: " + qObligatoryCoursesApproved[0] + "/" + qObligatoryCourses[0]);
            System.out.println("Optional courses approved: " + qOptionalCoursesCreditsApproved[0] + "/" + degree.minOptionalCredits);
        });
    }
}
