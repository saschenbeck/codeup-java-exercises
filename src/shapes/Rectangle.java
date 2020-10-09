package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double inputLength, double inputWidth) {
        super(inputLength, inputWidth);
    }

    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    public double getArea() {
        return this.length * this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
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

