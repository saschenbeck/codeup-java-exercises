package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double inputLength, double inputWidth){
        this.length = inputLength;
        this.width = inputWidth;
    }
}
