package Practice3.one;

public class Circle extends Shape {
    public double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double CalculateS() {
        return Math.PI * r * r;
    }

    @Override
    public double CalculateC() {
        return 2 * Math.PI *r;
    }

    public Circle(double r){
        setR(r);
    }
}
