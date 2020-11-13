package Practice3.two;

public class Bird extends Animal implements Eat,Sleep,Fly{

    @Override
    public void eat() {
        System.out.println("鸟吃虫子");
    }

    @Override
    public void fly() {
        System.out.println("鸟在天空中飞翔");
    }

    @Override
    public void sleep() {
        System.out.println("鸟站着睡");
    }
}
