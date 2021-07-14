package racingcar.domain;

import racingcar.util.RandomNumber;

public class Car {

    private static final int CAR_NAME_MIN_LENGTH = 1;
    private static final int CAR_NAME_MAX_LENGTH = 5;
    private static final String NAME_LENGTH_ERROR_MESSAGE = "1-5 자리의 이름만 입력 가능합니다.";
    private static final int CAR_MOVING_MIN_NUMBER = 0;
    private static final int CAR_MOVING_MAX_NUMBER = 9;
    private static final String NUMBER_RANGE_ERROR_MESSAGE = "1-9 숫자만 들어올수있습니다.";
    private static final int CAR_MOVING_NUMBER = 4;
    private String name;
    private int distance = 0;

    public Car(String name) {
        checkNameLength(name);
        this.name = name;
    }

    public Car(String name, int position) {
        checkNameLength(name);
        this.name = name;
        this.distance = position;
    }

    private void checkNameLength(String name) {
        if(!(name.length() <= CAR_NAME_MAX_LENGTH) || !(name.length() >= CAR_NAME_MIN_LENGTH)) {
            throw new IllegalArgumentException(NAME_LENGTH_ERROR_MESSAGE);
        }
    }

    public Car moveCar() {
        int num = RandomNumber.getRandomNumber();

        if(num < CAR_MOVING_MIN_NUMBER || num > CAR_MOVING_MAX_NUMBER) {
            throw new IllegalArgumentException(NUMBER_RANGE_ERROR_MESSAGE);
        }

        if(num >= CAR_MOVING_NUMBER) {
            return new Car(this.name, this.distance +1);
        }

        return this;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

}
