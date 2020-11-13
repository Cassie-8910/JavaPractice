package Practice3.two;

public class Cat extends Animal implements Eat,Sleep{
    @Override
    public void eat(){
        System.out.println("猫吃猫粮");
    }

    @Override
    public void sleep() {
        System.out.println("猫趴着睡");
    }
}
