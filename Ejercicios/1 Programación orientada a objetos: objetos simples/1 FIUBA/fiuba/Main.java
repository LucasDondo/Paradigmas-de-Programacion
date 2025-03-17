package fiuba;

public class Main { 
    public static void main(String[] args) {
        Faculty fiuba = new Faculty();
        fiuba.createDegree("10", "Ingeniería Informática", 24);
        fiuba.addCourses("10",
            new Course("TB022", "Introducción al Desarrollo de Software", 6, true),
            new Course("TB021", "Fundamentos de Programación", 6, true),
            new Course("CB001", "Análisis Matemático II", 8, true),
            new Course("TB027", "Lenguajes y Compiladores I", 6, false),
            new Course("TB033", "Lenguajes y Compiladores II", 6, false),
            new Course("TB034", "Arquitectura de Software", 4, false)
        );

        fiuba.signInOrUp();
        fiuba.showProgress();
    }
}
