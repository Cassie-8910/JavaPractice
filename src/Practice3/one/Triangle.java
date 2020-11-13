package Practice3.one;

public class Triangle extends Shape {
    public double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double CalculateS() {
        return side*side*Math.sin(Math.PI/3) / 2;
    }

    @Override
    public double CalculateC() {
        return 3*side;
    }

    public Triangle(double side){
        setSide(side);
    }
}
