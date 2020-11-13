package Practice3.two;

public class Human extends Animal implements Eat,Sleep,Think,Speak {
    @Override
    public void eat() {
        System.out.println("人吃饭");
    }
    @Override
    public void sleep() {
        System.out.println("人在床上躺着睡");
    }
    @Override
    public void speak() {
        System.out.println("人有语言交流");
    }
    @Override
    public void think() {
        System.out.println("人会思考");
    }
}
