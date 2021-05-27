package baseBall.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringCalculator.StringAddCalculator;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {

    private Balls computerBalls;
    private Balls inputBalls;
    private List<Ball> computerNumbersList;
    private List<Ball> inputNumbersList;
    private Referee referr;

    @BeforeEach
    void setup() {
        referr = new Referee();
    }

    @DisplayName("스트라이크의 갯수를 반환한다.")
    @Test
    public void 스트라이크의_갯수를_반환() {
        //given
        computerNumbersList = Arrays.asList(new Ball(1), new Ball(2), new Ball(3));
        inputNumbersList = Arrays.asList(new Ball(9), new Ball(2), new Ball(3));

        //when
        computerBalls = new Balls(computerNumbersList);
        inputBalls = new Balls(inputNumbersList);
        referr.scoreBall(computerBalls, inputBalls);
        referr.getScore();

        //then
        //assertThat(numbers).isInstanceOf(Numbers.class);
    }








}