package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Result {

    Cars cars;
    private int maxDistance = 0;
    List<String> winners = new ArrayList<>();

    public Result(Cars cars) {
        this.cars = cars;
    }

    // 해당이름의 차 거리 반환
    /*public int getCarDistance(String name) {
        return cars.findCarByName(name).getDistance();
    }*/

    // 우승자 반환
    public List<String> getWinners() {
        getMaxDistance();

        for (Car car : cars.getCars()) {
            compareDistanceAndGetName(car);
        }

        return winners;
    }

    private void compareDistanceAndGetName(Car car) {
        if (car.getDistance() == maxDistance) {
            winners.add(car.getName());
        }
    }

    private void getMaxDistance() {
        for (Car car : cars.getCars()) {
            compareDistanceAndSetLongerDistance(car.getDistance());
        }
    }

    private void compareDistanceAndSetLongerDistance(int distance) {
        if (distance > this.maxDistance) {
            this.maxDistance = distance;
        }
    }

    public Cars getRoundCars() {
        return cars;
    }

}
