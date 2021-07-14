package racingcar;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Result;
import racingcar.ui.InputView;
import racingcar.ui.OutputView;

import java.util.*;

public class RacingGame {

    InputView inputView = new InputView();
    OutputView outView = new OutputView();

    public void startGame() {
        String[] carNames = inputView.inputNames();

        Cars cars = new Cars(carNames);
        int maxRound = inputView.inputMaxRound();
        List<Result> resultList = runRound(cars, maxRound);

        outView.printRound(resultList);

        outView.printWinner(resultList.get(maxRound-1));
    }

    public List<Result> runRound(Cars cars, int maxRound) {
        List<Result> resultList = new ArrayList<>();

        for(int i = 0; i < maxRound; i++) {
            cars = cars.runCars();
            resultList.add(new Result(cars));
        }

        return resultList;
    }

}
