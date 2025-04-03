package shapes;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2, 3);
        shapes[2] = new Square(2);
        double totalArea = 0;
        
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        System.out.println(totalArea);
    }
}