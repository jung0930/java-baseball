package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {

    private Distance distance;

    @DisplayName("거리 설정 테스트")
    @Test
    public void 거리_설정_테스트() {
        //given
        distance = new Distance(5);

        //when && then
        assertThat(distance.getDistance()).isEqualTo(5);
    }

}