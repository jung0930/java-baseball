package baseBall.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import stringCalculator.StringAddCalculator;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    private Numbers numbers;

    @BeforeEach
    void setup() {
        numbers = new Numbers();
    }

    @DisplayName("입력한 숫자가 3개일 경우 TRUE RETURN")
    @Test
    public void sizeCheck_사이즈정상처리() {
        //given
        numbers.addNumber(new Number(1));
        numbers.addNumber(new Number(2));
        numbers.addNumber(new Number(3));

        List<Number> list = new ArrayList<>();
        list.add(new Number(1));
        list.add(new Number(3));
        list.add(new Number(5));
        // numbers = new Numbers(list);

        //when

        //then
        assertThat(numbers.sizeCheck()).isTrue();
    }

    @DisplayName("입력한 숫자가 3개가 아닐경우 예외발생")
    @Test
    public void sizeCheck_범위예외발생() {
        //given
        numbers.addNumber(new Number(1));
        numbers.addNumber(new Number(2));
        numbers.addNumber(new Number(3));
        numbers.addNumber(new Number(4));

        //when

        //then
        assertThatThrownBy(() -> numbers.sizeCheck())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("3개의 숫자를 입력해야합니다.");
    }

    @DisplayName("입력한 숫자가 서로 다른 수일 경우 TRUE RETURN")
    @Test
    public void otherCheck_서로다른수정상처리() {
        //given
        numbers.addNumber(new Number(1));
        numbers.addNumber(new Number(2));
        numbers.addNumber(new Number(3));
        // numbers = new Numbers(list);

        //when

        //then
        assertThat(numbers.otherCheck()).isTrue();
    }

}