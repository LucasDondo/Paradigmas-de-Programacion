package fiuba;

public class Main { 
    public static void main(String[] args) {
        Faculty fiuba = initialization();
        clearScreen();
        fiuba.signInOrUp();
        
        boolean continueRunning = true;
        while (continueRunning) {
            String nextStep = getNextStep();
            clearScreen();

            switch (nextStep) {
                case "e" -> fiuba.enrollOnDegree();
                case "m" -> {
                    fiuba.markCourseAsApproved();
                    fiuba.showProgress();
                }
                case "s" -> fiuba.showProgress();
                case "l" -> fiuba.signInOrUp();
                case "q" -> {
                    fiuba.showProgress();
                    continueRunning = false;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
    
    public static Faculty initialization(){
        Faculty fiuba = new Faculty();
        
        Course ids = new Course("TB022", "Introducción al Desarrollo de Software", 6, true);
        Course fdp = new Course("TB021", "Fundamentos de Programación", 6, true);
        Course am2 = new Course("CB001", "Análisis Matemático II", 8, true);
        
        fiuba.createDegree("10", "Ingeniería Informática", 24);
        fiuba.addCourses("10", ids, fdp, am2,
        new Course("TB027", "Lenguajes y Compiladores I", 6, false),
        new Course("TB033", "Lenguajes y Compiladores II", 6, false),
        new Course("TB034", "Arquitectura de Software", 4, false)
        );
        
        fiuba.createDegree("11", "Licenciatura en Sistemas", 28);
        fiuba.addCourses("11", ids, fdp, am2,
            new Course("91.35", "Análisis de Casos", 3, false),
            new Course("95.19", "Simulación", 6, false),
            new Course("95.48", "Lenguajes Formales", 6, false)
            );
            
        return fiuba;
    }
    
    public static void clearScreen() {
        System.out.print("\033c");
    }

    public static String getNextStep(){
        System.out.println("\nWhat do you want to do?");
        System.out.println("- (`e`) Enroll on a degree");
        System.out.println("- (`m`) Mark course as approved");
        System.out.println("- (`s`) Show progress");
        System.out.println("- (`l`) Log out");
        System.out.println("- (`q`) Quit");

        return System.console().readLine();
    }
}
