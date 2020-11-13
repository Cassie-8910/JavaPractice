package Practice4;

import java.util.ArrayList;
import java.util.List;

public class Lottery {
    public static void main(String[] args) {
        Lottery lotteryDemo = new Lottery();
        System.out.println(lotteryDemo.getLotteryArray(LotteryType.TwentyTwoOufOf5));
        System.out.println(lotteryDemo.getLotteryArray(LotteryType.ThreeThreeOutOf7));
        System.out.println(lotteryDemo.getLotteryArray(LotteryType.DoubleColorBall));

    }

    String getLotteryArray(LotteryType type) {
        List<String> res = new ArrayList<>();
        switch (type) {
            case DoubleColorBall:
                for (int i = 0; i < 6; i++) {
                    res.add(String.valueOf((int) (Math.random() * 32) + 1));
                }
                res.add(String.valueOf((int) (Math.random() * 15) + 1));
                break;
            case TwentyTwoOufOf5:
                for (int i = 0; i < 5; i++) {
                    res.add(String.valueOf((int) (Math.random() * 21) + 1));
                }
                break;
            case ThreeThreeOutOf7:
                for (int i = 0; i < 7; i++) {
                    res.add(String.valueOf((int) (Math.random() * 32) + 1));
                }
        }
        return String.join(",", res);
    }
}


enum LotteryType {
    TwentyTwoOufOf5,
    ThreeThreeOutOf7,
    DoubleColorBall
}
