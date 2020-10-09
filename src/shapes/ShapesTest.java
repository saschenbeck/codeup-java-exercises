package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(4);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape.setLength(5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape.setLength(6);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}
