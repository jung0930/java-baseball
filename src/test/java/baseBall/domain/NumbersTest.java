package baseBall.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumbersTest {

    private Numbers numbersDomain;

    @BeforeEach
    void setup() {
        numbersDomain = new Numbers();
    }

    @DisplayName("생성된 숫자들이 3개인지 확인")
    @Test
    public void createNumbers_숫자개수() {
        //given

        //when
        String[] numbers = numbersDomain.createNumbers();
        int count = numbers.length;

        //then
        assertThat(count).isEqualTo(3);
    }

    @DisplayName("생성된 숫자들의 범위가 1-9인지 확인")
    @Test
    public void createNumbers_숫자범위() {
        //given

        //when
        String[] numbers = numbersDomain.createNumbers();
        int count = numbers.length;

        //then
        //assertThat(count).isEqualTo(3);
    }

}