package racingcar.domain;

import racingcar.strategy.moveStrategy.MoveStrategy;

public class Car {

    private final Name name;
    private final Distance distance;

    public Car(String name) {
        this(new Name(name), new Distance());
    }

    public Car(Name name, Distance distance) {
        this.name = name;
        this.distance = distance;
    }

    public Car moveCar(MoveStrategy moveStrategy) {
        if(moveStrategy.isMoveable()) {
            return new Car(name, this.distance.addDistance());
        }
        return this;
    }

    public String getName() {
        return name.getName();
    }

    public int getDistance() {
        return distance.getDistance();
    }

}
