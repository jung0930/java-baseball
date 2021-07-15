package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameTest {

    private Name name;

    @DisplayName("이름부여 테스트")
    @Test
    public void 이름_부여_테스트() {
        //given
        name = new Name("ABC");

        //when && then
        assertThat(name.getName()).isEqualTo("ABC");
    }

    @DisplayName("이름을 입력하지 않았을때 예외발생")
    @Test
    public void 이름을_입력하지_않았을때_예외발생() {
        //given && when && then
        assertThatThrownBy(() -> new Name(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름을 입력해주세요.");
    }

    @DisplayName("이름 길이가 1에서 5가 아닐때 예외발생")
    @Test
    public void 이름_길이가_1에서_5가_아닐때_예외발생() {
        //given && when && then
        assertThatThrownBy(() -> new Name("ABCDEF"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("1-5 자리의 이름만 입력 가능합니다.");
    }

}