package baseBall.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    private Numbers numbers;

    @DisplayName("입력한 숫자가 3개일 경우 TRUE RETURN")
    @Test
    public void ssizeCheck_사이즈정상처리() {
        //given
        List<Number> list = new ArrayList<>();
        list.add(new Number(1));
        list.add(new Number(3));
        list.add(new Number(5));
        numbers = new Numbers(list);

        //when

        //then
        assertThat(numbers.sizeCheck()).isTrue();
    }


}