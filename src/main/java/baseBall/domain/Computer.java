package baseBall.domain;

import java.util.List;

public class Computer {

    private final Balls balls;

    // 정적 팩토리 메서드로 바꿀것.
    public Computer(List<Ball> ballList) {
        balls = new Balls(ballList);
    }

    public Balls getBalls() {
        return balls;
    }

}
