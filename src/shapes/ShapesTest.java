package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(2,3);
        Quadrilateral myFirstShape = new Rectangle(4,5);
        Measurable mySecondShape = new Square(5);

        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myFirstShape.getArea() = " + myFirstShape.getArea());
        System.out.println("myFirstShape.getPerimeter() = " + myFirstShape.getPerimeter());
        System.out.println("mySecondShape.getArea() = " + mySecondShape.getArea());
        System.out.println("mySecondShape.getPerimeter() = " + mySecondShape.getPerimeter());

        /*Only allowed because myFirstShape is declared as a Quadrilateral rather than a Measurable
        * and setLenght is established at the Quadrilateral abstract class and not the Measurable
        * interface*/
        myFirstShape.setLength(5);
        System.out.println("myFirstShape.getArea() = " + myFirstShape.getArea());
        System.out.println("myFirstShape.getPerimeter() = " + myFirstShape.getPerimeter());
        System.out.println("myFirstShape.getLength() = " + myFirstShape.getLength());
        myFirstShape.setLength(1);
        System.out.println("myFirstShape.getArea() = " + myFirstShape.getArea());
        System.out.println("myFirstShape.getPerimeter() = " + myFirstShape.getPerimeter());
        System.out.println("myFirstShape.getLength() = " + myFirstShape.getLength());
    }
}
