package baseBall.domain;

import java.util.*;

public class Balls {

    private static final String SIZE_ERROR_MESSAGE = "3개의 숫자를 입력해야합니다.";
    private static final String OTHER_ERROR_MESSAGE = "모두 다른 숫자를 입력해야합니다.";
    private static final int NUMBERS_SIZE = 3;
    private final List<Ball> balls = new ArrayList<>();

    public Balls(List<Ball> ballList) {
        checkSize(ballList);
        checkOhter(ballList);

        for(Ball ball : ballList) {
            balls.add(ball);
        }
    }

    private void checkSize(List<Ball> ballList) {
        if(ballList.size() != NUMBERS_SIZE) {
            throw new IllegalArgumentException(SIZE_ERROR_MESSAGE);
        }
    }

    // 입력한 숫자가 모두 다른 값인지 확인
    private void checkOhter(List<Ball> ballList) {
        Set<Ball> ballSet = new HashSet<Ball>(ballList);

        if(ballList.size() != ballSet.size()) {
            throw new IllegalArgumentException(OTHER_ERROR_MESSAGE);
        }
    }

    public int size() {
        return balls.size();
    }

    public Ball get(int index) {
        return balls.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Balls that = (Balls) o;
        return balls == that.balls;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balls);
    }

}
