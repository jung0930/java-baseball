package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringAddCalculatorTest {

    private StringAddCalculator calculator;

    @BeforeEach
    void setup() {
        calculator = new StringAddCalculator();
    }

    @DisplayName("null이나 빈문자일 경우 0을 반환하는지 테스트")
    @ParameterizedTest
    @NullAndEmptySource
    public void splitAndSum_null_또는_빈문자(String input) {
        int result = calculator.splitAndSum(input);
        assertThat(result).isEqualTo(0);
    }

    @DisplayName("숫자 하나로 이루어진 문자일 경우 그대로 반환하는지 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1=1", "5=5"}, delimiter = '=')
    public void splitAndSum_숫자하나(String input, int expected) {
        int result = calculator.splitAndSum(input);
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("쉼표를 구분자로 동작하는지 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1,2=3", "5,0=5"}, delimiter = '=')
    public void splitAndSum_쉼표구분자(String input, int expected) {
        int result = calculator.splitAndSum(input);
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("쉼표 혹은 콜론을 구분자로 동작하는지 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1,2:3=6", "4,5,6=15"}, delimiter = '=')
    public void splitAndSum_쉼표_또는_콜론_구분자(String input, int expected) {
        int result = calculator.splitAndSum(input);
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("구분자를 임의로 생성하여 동작하는지 테스트")
    @Test
    public void splitAndSum_custom_구분자() {
        int result = calculator.splitAndSum("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }

    @DisplayName("음수가 있을 경우 예외를 던지는지 테스트")
    @Test
    public void splitAndSum_negative() {
        assertThatThrownBy(() -> calculator.splitAndSum("-1,2,3"))
                .isInstanceOf(RuntimeException.class);
    }

}