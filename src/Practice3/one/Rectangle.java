package Practice3.one;

public class Rectangle extends Shape{
    public double length;
    public double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double CalculateS() {
        return length * width;
    }

    @Override
    public double CalculateC() {
        return (length+width) * 2;
    }

    public Rectangle(double length,double width){
        setLength(length);
        setWidth(width);
    }
}
