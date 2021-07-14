package racingcar.domain;

import baseBall.domain.Ball;
import baseBall.domain.Balls;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    private Car car;

    @DisplayName("자동차 이름부여 테스트")
    @Test
    public void 자동차_이름부여_테스트() {
        //given
        car = new Car("ABC");

        //when && then
        assertThat(car.getName()).isEqualTo("ABC");
    }

    @DisplayName("자동차 이름의 길이가 1에서 5사이일때 객체반환")
    @Test
    public void 자동차_이름의_길이가_1에서_5사이일때_객체반환() {
        //given
        car = new Car("ABC");

        //when

        //then
        assertThat(car).isInstanceOf(Car.class);
    }

    @DisplayName("자동차 이름의 길이가 1에서 5사이가 아닐때 오류메시지 발생")
    @Test
    public void 자동차_이름의_길이가_1에서_5사이가_아닐때_오류메시지_발생() {
        //given && when && then
        assertThatThrownBy(() -> new Car("ABCDEF"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("1-5 자리의 이름만 입력 가능합니다.");
    }

    /*
    @DisplayName("입력된 숫자가 4 이상일 경우 자동차를 앞으로 한칸 이동")
    @Test
    public void 입력된_숫자가_4_이상일_경우_자동차를_앞으로_한칸_이동() {
        //given
        car = new Car("ABC");

        //when
        car = car.moveCar(5);

        //then
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @DisplayName("입력된 숫자가 3 이하일 경우 자동차를 이동시키지 않음")
    @Test
    public void 자동차를_앞으로_한칸_이동() {
        //given
        car = new Car("ABC");

        //when
        car = car.moveCar(5);

        //then
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @DisplayName("입력된 숫자가 1에서_9가 아닐때 오류메시지 발생")
    @ParameterizedTest
    @ValueSource(ints = { 0, 10})
    public void 입력된_숫자가_1에서_9가_아닐때_오류메시지_발생(int num) {
        //given
        car = new Car("ABC");

        //when && then
        assertThatThrownBy(() -> car.moveCar(num))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("1-9 숫자만 들어올수있습니다.");
    }
    */

}
