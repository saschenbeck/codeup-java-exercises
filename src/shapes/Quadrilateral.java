package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double inputLength, double inputWidth){
        this.length = inputLength;
        this.width = inputWidth;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}
