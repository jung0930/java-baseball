package racingcar.ui;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Result;

import java.util.List;

public class OutputView {

    // OutputView Message
    public static final String RESULT_RACING_END_MESSAGE = "경기 결과";
    public static final String RESULT_RACING_WINNER_MESSAGE = "가 최종 우승했습니다.";
    public static final String COMMA = ",";

    public void printRound(List<Result> resultList) {
        for(Result result : resultList) {
            System.out.println(RESULT_RACING_END_MESSAGE);
            printLap(result);
        }
    }

    private void printLap(Result result) {
        List<Car> carList = result.getRoundCars().getCar();

        for(int i = 0; i < carList.size(); i++) {
            String name = carList.get(i).getName();
            String distancePrint = printDistance(carList.get(i).getDistance());
            System.out.println(name + " : " + distancePrint);
        }
    }

    private String printDistance(int distance) {
        StringBuilder print = new StringBuilder();
        for(int i = 0; i < distance; i++) {
            print.append("-");
        }

        return print.toString();
    }

    public void printWinner(Result result) {
        StringBuilder print = new StringBuilder();
        List<String> getWinners = result.getWinners();

        for(int i = 0; i < getWinners.size(); i++) {
            print.append(getWinners.get(i));

            if(i != getWinners.size()-1) {
                print.append(COMMA);
            }
        }

        System.out.println(print + RESULT_RACING_WINNER_MESSAGE);
    }

}
