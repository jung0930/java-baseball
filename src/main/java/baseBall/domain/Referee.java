package baseBall.domain;

import java.util.HashMap;
import java.util.Map;

public class Referee {

    private static final int NUMBERS_SIZE = 3;

    // 점수도 객체로 관리?? -> 일단 기능구현부터
    private int strikeCount;
    private int ballCount;
    // private HashMap<Integer, Record> score = new HashMap();

    public void countScore(Balls computerBalls, Balls inputBalls) {

        // 스트라이크처리
        countOfStrike(computerBalls, inputBalls);

        // 볼처리
        countOfBall(computerBalls, inputBalls);

        // 낫싱처리
    }

    private void countOfStrike(Balls computerBalls, Balls inputBalls) {
        for(int i = 0; i < NUMBERS_SIZE; i++) {
            compareStrike(computerBalls.get(i), inputBalls.get(i));
        }
    }

    private void compareStrike(Ball computerBall, Ball inputBall) {
        if(computerBall.equals(inputBall)) {
            strikeCount++;
        }
    }

    private void countOfBall(Balls computerBalls, Balls inputBalls) {
        for(int i = 0; i < NUMBERS_SIZE; i++) {
            for(int j = 0; j < NUMBERS_SIZE; j++) {
                if(i == j) {
                    continue;
                }
                if(computerBalls.get(i).equals(inputBalls.get(j))) {
                    ballCount++;
                }
            }
        }
    }

    public String getScore() {
        if(strikeCount == 0 && ballCount == 0) {
            return "낫싱";
        }
        return String.format("%d 스트라이크 %d 볼", strikeCount, ballCount);
    }

}
