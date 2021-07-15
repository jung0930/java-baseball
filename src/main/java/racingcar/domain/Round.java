package racingcar.domain;

import racingcar.strategy.moveStrategy.MoveStrategy;
import racingcar.util.Const;

import java.util.*;

public class Round {

    private final List<Car> carList;

    public Round(String userInputNames) {
        List<String> carNames = Arrays.asList(userInputNames.split(","));

        checkCarsSize(carNames);
        checkSameCarName(carNames);

        carList = addCar(carNames);
    }

    public Round(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> addCar(List<String> carNames) {
        List<Car> carList = new ArrayList<>();

        for(String carName : carNames) {
            carList.add(new Car(carName));
        }

        return carList;
    }

    public Round runCars(MoveStrategy moveStrategy) {
        List<Car> movedCars = new ArrayList<>();

        for (Car car : carList) {
            movedCars.add(car.moveCar(moveStrategy));
        }

        return new Round(movedCars);
    }

    public List<Car> getCars() {
        return this.carList;
    }

    private void checkCarsSize(List<String> carNames) {
        if(carNames.size() < Const.MIN_CARS_SIZE) {
            throw new IllegalArgumentException(Const.SIZE_CHECK_ERROR_MESSAGE);
        }
    }

    private void checkSameCarName(List<String> carNames) {
        Set<String> carSet = new HashSet<>(carNames);

        if(carSet.size() != carNames.size()) {
            throw new IllegalArgumentException(Const.SAME_NAME_ERROR_MESSAGE);
        }
    }

}
