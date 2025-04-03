package fiuba;

import java.util.HashMap;
import java.util.Map;

public class Faculty {
    private final HashMap<String, Degree> degrees;
    public final Map<Integer, Student> students;
    private Student loggedInStudent;

    public Faculty(){
        degrees = new HashMap<>();
        students = new HashMap<>();
    }

    public void createDegree(String id, String name, int minOptionalCredits){
        degrees.put(id, new Degree(id, name, minOptionalCredits));
    }

    public void addCourses(String degreeID, Course... coursesToAdd){
        Degree degree = degrees.get(degreeID);
        degree.addCourses(coursesToAdd);
        degrees.replace(degreeID, degree);
    }

    public void signInOrUp(){
        System.out.println("Enter your student ID:");
        String inputID = System.console().readLine();
        int id = Integer.parseInt(inputID);
        students.computeIfAbsent(id, Student::new);
        loggedInStudent = students.get(id);
        if (loggedInStudent.degrees.isEmpty()){
            this.enrollOnDegree();
        } else {
            loggedInStudent.showProgress();
        }
    }

    public void enrollOnDegree(){
        this.showDegrees();

        System.out.println("\nEnter the degree ID you want to enroll in:");
        String degreeID = System.console().readLine();

        loggedInStudent.enrollOnDegree(degrees.get(degreeID));
    }

    public void showDegrees(){
        System.out.println("\nDegrees available:");
        degrees.forEach((id, degree)->{
            if (!loggedInStudent.degrees.containsKey(id)){
                System.out.println(degree);
            }
        });
    }

    public void markCourseAsApproved(){
        loggedInStudent.markCourseAsApproved();
    }

    public void showProgress(){
        loggedInStudent.showProgress();
    }
}
