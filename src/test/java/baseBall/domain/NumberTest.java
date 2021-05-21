package baseBall.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import stringCalculator.StringAddCalculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    private Number number;

    @DisplayName("숫자의 범위가 1-9 사이가 아닐경우 예외발생")
    @ParameterizedTest
    @ValueSource(ints = { 0, 10, -5 })
    public void rangeCheck_범위예외처리(int num) {
        //given
        number = new Number(num);

        //when

        //then
        assertThatThrownBy(() -> number.rangeCheck())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("1-9 사이의 숫자만 입력 가능합니다.");
    }

    @DisplayName("숫자의 범위가 1-9 사이일경우 TRUE RETURN")
    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 5 })
    public void rangeCheck_범위정상처리(int num) {
        //given
        number = new Number(num);

        //when

        //then
        assertThat(number.rangeCheck()).isTrue();
    }

}