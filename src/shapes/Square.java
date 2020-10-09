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
