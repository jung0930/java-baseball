package racingcar.strategy.moveStrategy;

import racingcar.util.RandomNumber;

public class RacingMoveStrategy implements MoveStrategy{

    private static final int MOVE_CONDITION = 4;

    @Override
    public boolean isMoveable() {
        return MOVE_CONDITION <= RandomNumber.getRandomNumber();
    }
}
