package fiuba;

import java.util.HashMap;


public class Degree {
    private final String id;
    public final String name;
    public int minOptionalCredits;
    public HashMap<String, Course> courses;

    public Degree(String id, String name, int minOptionalCredits){
        this.id = id;
        this.name = name;
        this.minOptionalCredits = minOptionalCredits;
        this.courses = new HashMap<>();
    }

    public void addCourses(Course... coursesToAdd){
        for (Course course : coursesToAdd){
            this.courses.put(course.id, course);
        }
    }
}
