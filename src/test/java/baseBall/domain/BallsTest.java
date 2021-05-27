package baseBall.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BallsTest {

    private Balls balls;
    private List<Ball> ballList;

    @DisplayName("입력한 숫자가 3개이고 다른숫자들일 경우 인스턴스 정상 생성")
    @Test
    public void sizeCheck_사이즈정상처리() {
        //given
        ballList = Arrays.asList(new Ball(1), new Ball(2), new Ball(3));

        //when
        balls = new Balls(ballList);

        //then
        assertThat(balls).isInstanceOf(Balls.class);
    }

    @DisplayName("입력한 숫자가 3개가 아닐경우 예외발생")
    @Test
    public void sizeCheck_범위예외발생() {
        //given
        ballList = Arrays.asList(new Ball(1), new Ball(2), new Ball(3), new Ball(4));

        //when

        //then
        assertThatThrownBy(() -> new Balls(ballList))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("3개의 숫자를 입력해야합니다.");
    }

    @DisplayName("입력한 숫자 중 중복된 숫자가 있을 경우 예외발생")
    @Test
    public void otherCheck_같은수예외처리() {
        //given
        ballList = Arrays.asList(new Ball(1), new Ball(2), new Ball(2));

        //when

        //then
        assertThatThrownBy(() -> new Balls(ballList))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("모두 다른 숫자를 입력해야합니다.");
    }

}
