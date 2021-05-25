package baseBall.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NumberTest {

    private Number number;

    @DisplayName("숫자의 범위가 1-9 사이일경우 인스턴스 정상 생성")
    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 5 })
    public void rangeCheck_범위정상처리(int num) {
        //given
        number = new Number(num);

        //when

        //then
        assertThat(number).isInstanceOf(Number.class);
    }

    @DisplayName("숫자의 범위가 1-9 사이가 아닐경우 예외발생")
    @ParameterizedTest
    @ValueSource(ints = { 0, 10, -5 })
    public void rangeCheck_범위예외처리(int num) {
        //given

        //when

        //then
        assertThatThrownBy(() -> new Number(num))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("1-9 사이의 숫자만 입력 가능합니다.");
    }

    @DisplayName("숫자만 입력했을경우 인스턴스 정상 생성")
    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    public void isNumberCheck_숫자만입력(int num) {
        //given
        number = new Number(num);

        //when

        //then
        assertThat(number).isInstanceOf(Number.class);
    }

    @DisplayName("문자열을 입력했을경우 예외발생")
    @ParameterizedTest
    @ValueSource(strings = { "가", "/", "A" })
    public void isNumberCheck_문자열입력(String input) {
        //given

        //when

        //then
        assertThatThrownBy(() -> new Number(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자만 입력 가능합니다.");
    }

}