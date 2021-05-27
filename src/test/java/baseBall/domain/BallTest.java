package baseBall.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BallTest {

    private Ball ball;

    @DisplayName("숫자의 범위가 1-9 사이일경우 인스턴스 정상 생성")
    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 5 })
    public void rangeCheck_범위정상처리(int num) {
        //given
        ball = new Ball(num);

        //when

        //then
        assertThat(ball).isInstanceOf(Ball.class);
    }

    @DisplayName("숫자의 범위가 1-9 사이가 아닐경우 예외발생")
    @ParameterizedTest
    @ValueSource(ints = { 0, 10, -5 })
    public void rangeCheck_범위예외처리(int num) {
        //given

        //when

        //then
        assertThatThrownBy(() -> new Ball(num))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("1-9 사이의 숫자만 입력 가능합니다.");
    }

}