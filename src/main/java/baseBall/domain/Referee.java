package baseBall.domain;

public class Referee {

    private static final int NUMBERS_SIZE = 3;
    private int strikeCount = 0;
    private int ballCount = 0;

    public void scoreBall(Balls computerBalls, Balls inputBalls) {

        // 스트라이크처리
        scoreStrike(computerBalls, inputBalls);

        // 볼처리
        scoreBall();

        // 낫싱처리

    }

    private void scoreStrike(Balls computerBalls, Balls inputBalls) {
        for(int i = 0; i < NUMBERS_SIZE; i++) {
            compareStrikeBall(computerBalls.get(i), inputBalls.get(i));
        }

    }

    private void compareStrikeBall(Ball computerBall, Ball inputBall) {
        if(computerBall.equals(inputBall)) {
            strikeCount++;
        }
    }

    private void scoreBall() {

    }

    public void getScore() {
        String message = String.format("%d 스트라이크 %d 볼", strikeCount, ballCount);

        System.out.println(message);

        // 점수반환시 객체로?? Score??

        // return (strikeCount == 0 && ballCount == 0) ? "낫싱" : String.format("%d 스트라이크 %d 볼", strikeCount, ballCount);
    }

}
