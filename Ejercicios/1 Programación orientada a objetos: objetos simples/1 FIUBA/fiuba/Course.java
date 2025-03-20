package fiuba;

public class Course {
    public final String id;
    private final String name;
    public final int credits;
    public final boolean obligatory;

    public Course(String id, String name, int credits, boolean obligatory){
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.obligatory = obligatory;
    }

    @Override
    public String toString(){
        return id + " | " + credits + " credits | " + (obligatory ? "Obligatory | " : "Optional   | ") + name;
    }
}
