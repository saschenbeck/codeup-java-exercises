package shapes;

public class Square extends Quadrilateral{
    public Square(double inputSide){
        super(inputSide, inputSide);
    }

    public double getPerimeter() {
        return this.length * 4;
    }

    public double getArea() {
        return Math.pow(this.length, 2);
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }


//    protected double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//
//    public double getPerimeter(){
////        System.out.println("square-perimeter");
//        return side * 4;
//    }
//
//    public double getArea(){
////        System.out.println("square-area");
//        return Math.pow(side, 2);
    }
