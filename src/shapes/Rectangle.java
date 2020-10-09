package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double inputLength, double inputWidth) {
        super(inputLength, inputWidth);
    }

    public double getArea() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public void setLength(double i) {
        this.length = i;
    }


    public double getPerimeter() {
        return this.length * this.width;
    }


    //    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        return this.length * this.width;
//    }
//
//    public double getPerimeter(){
//        return (this.length * 2) + (this.width * 2);
}

