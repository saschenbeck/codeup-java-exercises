package shapes;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }


    public double getPerimeter(){
//        System.out.println("square-perimeter");
        return side * 4;
    }

    public double getArea(){
//        System.out.println("square-area");
        return Math.pow(side, 2);
    }
}
