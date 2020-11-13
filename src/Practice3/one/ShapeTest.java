package Practice3.one;

public class ShapeTest {
    public static void main(String[] args){
        Circle circle = new Circle(2.5);
        Rectangle rec = new Rectangle(10,6);
        Triangle tri = new Triangle(3);
        System.out.println("circle的面积为：" + circle.CalculateS());
        System.out.println("circle的周长为：" + circle.CalculateC());
        System.out.println("rec的面积为：" + rec.CalculateS());
        System.out.println("rec的周长为：" + rec.CalculateC());
        System.out.println("tri的面积为：" + tri.CalculateS());
        System.out.println("tri的周长为：" + tri.CalculateC());
    }
}
