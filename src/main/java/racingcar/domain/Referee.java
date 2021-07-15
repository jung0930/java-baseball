package racingcar.domain;

import racingcar.strategy.moveStrategy.MoveStrategy;
import racingcar.strategy.moveStrategy.RacingMoveStrategy;

import java.util.ArrayList;
import java.util.List;

public class Referee {

    private final List<Round> roundList = new ArrayList<>();

    public List<Round> getRoundList() {
        return roundList;
    }

    public List<Car> getWinners() {
        List<Car> carList = getFinalRound();

        int maxDistance = getMaxDistance(carList);

        return getCarByDistance(carList, maxDistance);
    }

    public List<Car> getFinalRound() {
        return roundList.get(roundList.size()-1).getCars();
    }

    private int getMaxDistance(List<Car> carList) {
        int maxDistance = 0;

        for(Car car : carList) {
            maxDistance = compareLongerDistance(maxDistance, car);
        }
        return maxDistance;
    }

    private int compareLongerDistance(int maxDistance, Car car) {
        if(car.getDistance() > maxDistance){
            maxDistance = car.getDistance();
        }
        return maxDistance;
    }

    private List<Car> getCarByDistance(List<Car> carList, int maxDistance) {
        List<Car> winners = new ArrayList<>();

        for(Car car : carList) {
            compareEqualsDistance(maxDistance, car, winners);
        }

        return winners;
    }

    private void compareEqualsDistance(int maxDistance, Car car, List<Car> winners) {
        if(car.getDistance() == maxDistance){
            winners.add(car);
        }
    }

    public List<Round> startRound(String userInputNames, int maxRound) {
        MoveStrategy moveStrategy = new RacingMoveStrategy();
        Round round = new Round(userInputNames);

        for(int i = 0; i < maxRound; i++) {
            round = round.runCars(moveStrategy);
            roundList.add(round);
        }

        return roundList;
    }

}
