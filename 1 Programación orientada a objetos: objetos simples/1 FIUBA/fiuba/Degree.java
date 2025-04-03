package fiuba;

import java.util.HashMap;
import java.util.Map;


public class Degree {
    public final String id;
    public final String name;
    public final int minOptionalCredits;
    public final Map<String, Course> courses;

    public Degree(String id, String name, int minOptionalCredits){
        this.id = id;
        this.name = name;
        this.minOptionalCredits = minOptionalCredits;
        courses = new HashMap<>();
    }

    @Override
    public String toString(){
        return id + " | " + name;
    }

    public void addCourses(Course... coursesToAdd){
        for (Course course : coursesToAdd){
            courses.put(course.id, course);
        }
    }
}
