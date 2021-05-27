package baseBall.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {

    private Balls computerBalls;
    private Balls inputBalls;
    private List<Ball> computerNumbersList;
    private List<Ball> inputNumbersList;
    private Referee referee;

    @BeforeEach
    void setup() {
        referee = new Referee();
        computerNumbersList = Arrays.asList(new Ball(1), new Ball(2), new Ball(3));
        computerBalls = new Balls(computerNumbersList);
    }

    @DisplayName("콘솔메시지_3스트라이크")
    @Test
    public void _콘솔메시지_3스트라이크() {
        //given
        inputNumbersList = Arrays.asList(new Ball(1), new Ball(2), new Ball(3));

        //when
        inputBalls = new Balls(inputNumbersList);
        referee.countScore(computerBalls, inputBalls);

        //then
        assertThat(referee.getScore()).isEqualTo("3 스트라이크 0 볼");
    }

    @DisplayName("콘솔메시지_1스트라이크")
    @Test
    public void _콘솔메시지_1스트라이크() {
        //given
        inputNumbersList = Arrays.asList(new Ball(5), new Ball(6), new Ball(3));

        //when
        inputBalls = new Balls(inputNumbersList);
        referee.countScore(computerBalls, inputBalls);

        //then
        assertThat(referee.getScore()).isEqualTo("1 스트라이크 0 볼");
    }

    @DisplayName("콘솔메시지_3볼")
    @Test
    public void _콘솔메시지_3볼() {
        //given
        inputNumbersList = Arrays.asList(new Ball(2), new Ball(3), new Ball(1));

        //when
        inputBalls = new Balls(inputNumbersList);
        referee.countScore(computerBalls, inputBalls);

        //then
        assertThat(referee.getScore()).isEqualTo("0 스트라이크 3 볼");
    }

    @DisplayName("콘솔메시지_낫싱")
    @Test
    public void 콘솔메시지_낫싱() {
        //given
        inputNumbersList = Arrays.asList(new Ball(4), new Ball(5), new Ball(6));

        //when
        inputBalls = new Balls(inputNumbersList);
        referee.countScore(computerBalls, inputBalls);

        //then
        assertThat(referee.getScore()).isEqualTo("낫싱");
    }

    @DisplayName("3스트라이크일 경우 게임종료")
    @Test
    public void _3스트라이크일_경우_게임종료() {
        //given
        inputNumbersList = Arrays.asList(new Ball(1), new Ball(2), new Ball(3));

        //when
        inputBalls = new Balls(inputNumbersList);
        referee.countScore(computerBalls, inputBalls);

        //then
        assertThat(referee.isEndGame()).isTrue();
    }

    @DisplayName("3스트라이크가 아닐경우 게임계속진행")
    @Test
    public void _3스트라이크가_아닐경우_게임계속진행() {
        //given
        inputNumbersList = Arrays.asList(new Ball(1), new Ball(2), new Ball(4));

        //when
        inputBalls = new Balls(inputNumbersList);
        referee.countScore(computerBalls, inputBalls);

        //then
        assertThat(referee.isEndGame()).isFalse();
    }

}
