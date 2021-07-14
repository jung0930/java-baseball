package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsTest {

    private Cars cars;

    @DisplayName("인스턴스 정상 생성")
    @Test
    public void 인스턴스_정상_생성() {
        String[] carNames = "A,B,C,D,R".split(",");

        //given
        cars = new Cars(carNames);

        //then
        // assertThat(cars).isInstanceOf(Cars.class);
        // assertEquals(cars, new Cars(carNames));
        assertThat(cars).isEqualTo(new Cars(carNames));
        // assertThat(cars).isSameAs(new Cars(carNames));
    }

    @DisplayName("자동차가 1대 이하일때 예외발생")
    @Test
    public void 자동차가_1대_이하일때_예외발생() {
        //given
        String[] carNames = "A".split(",");

        // when && then
        assertThatThrownBy(() -> new Cars(carNames))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차는 2대 이상 입력해주세요.");
    }

    @DisplayName("중복된 자동차 이름이 있을때 예외발생")
    @Test
    public void 중복된_자동차_이름이_있을때_예외발생() {
        //given
        String[] carNames = "A,B,C,A".split(",");

        //when && then
        assertThatThrownBy(() -> new Cars(carNames))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 중복으로 입력할 수 없습니다.");
    }

    @DisplayName("자동차_리스트_길이_확인")
    @Test
    public void 자동차_리스트_길이_확인() {
        //given
        String[] carNames = "A,B,C,A".split(",");

        //then
        assertThat(cars.getCarsSize()).isEqualTo(6);
    }

}
