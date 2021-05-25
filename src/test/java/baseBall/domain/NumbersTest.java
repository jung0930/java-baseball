package baseBall.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NumbersTest {

    private Numbers numbers;
    private List<Number> numberList;

    @BeforeEach
    void setup() {
        numberList = new ArrayList<>();
    }

    @DisplayName("입력한 숫자가 3개일 경우 인스턴스 정상 생성")
    @Test
    public void sizeCheck_사이즈정상처리() {
        //given
        numberList.add(new Number(1));
        numberList.add(new Number(2));
        numberList.add(new Number(3));

        //when
        numbers = new Numbers(numberList);

        //then
        // assertThat(numbers.sizeCheck()).isTrue();
        assertThat(numbers).isInstanceOf(Numbers.class);
    }

    @DisplayName("입력한 숫자가 3개가 아닐경우 예외발생")
    @Test
    public void sizeCheck_범위예외발생() {
        //given
        numberList.add(new Number(1));
        numberList.add(new Number(2));
        numberList.add(new Number(3));
        numberList.add(new Number(4));

        //when

        //then
        assertThatThrownBy(() -> new Numbers(numberList))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("3개의 숫자를 입력해야합니다.");
    }

    @DisplayName("입력한 숫자가 서로 다른 수일 경우 인스턴스 정상 생성")
    @Test
    public void otherCheck_서로다른수정상처리() {
        //given
        numberList.add(new Number(1));
        numberList.add(new Number(2));
        numberList.add(new Number(3));

        //when
        numbers = new Numbers(numberList);

        //then
        assertThat(numbers).isInstanceOf(Numbers.class);
    }

}