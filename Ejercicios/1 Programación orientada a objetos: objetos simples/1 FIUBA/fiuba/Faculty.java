package fiuba;

import java.util.HashMap;

public class Faculty {
    private final HashMap<String, Degree> degrees;
    public final HashMap<Integer, Student> students;
    private Integer loggedInStudentID;

    public Faculty(){
        this.degrees = new HashMap<>();
        this.students = new HashMap<>();
    }

    public void createDegree(String id, String name, int minOptionalCredits){
        this.degrees.put(id, new Degree(id, name, minOptionalCredits));
    }

    public void addCourses(String degreeID, Course... coursesToAdd){
        Degree degree = this.degrees.get(degreeID);
        degree.addCourses(coursesToAdd);
        this.degrees.replace(degreeID, degree);
    }

    public void signInOrUp(){
        System.out.println("Enter your student ID:");
        String inputID = System.console().readLine();
        Integer id = Integer.valueOf(inputID);
        this.students.putIfAbsent(id, new Student(id));
        this.loggedInStudentID = id;
    }

    public void markCourseAsApproved(String id){
        Student student = this.students.get(loggedInStudentID);
        student.markCourseAsApproved(id);
        this.students.replace(loggedInStudentID, student);
    }

    public void showProgress(){
        Student student = this.students.get(loggedInStudentID);
        student.showProgress();
    }
}
