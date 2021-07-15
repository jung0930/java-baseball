package racingcar.ui;

import racingcar.domain.Car;
import racingcar.domain.Referee;
import racingcar.domain.Round;
import racingcar.util.Const;

import java.util.List;

public class OutputView {

    public void printRound(Referee referee) {

        List<Round> roundList = referee.getRoundList();

        for(Round round : roundList) {
            System.out.println(Const.RESULT_RACING_END_MESSAGE);
            printLap(round);
        }
    }

    private void printLap(Round round) {
        List<Car> carList = round.getCars();

        for (Car car : carList) {
            String name = car.getName();
            String distancePrint = printDistance(car.getDistance());
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

    public void printWinner(Referee referee) {
        StringBuilder print = new StringBuilder();
        List<Car> getWinners = referee.getWinners();

        for(int i = 0; i < getWinners.size(); i++) {
            print.append(getWinners.get(i).getName());
            printComma(print, getWinners, i);
        }

        System.out.println(print + Const.RESULT_RACING_WINNER_MESSAGE);
    }

    private void printComma(StringBuilder print, List<Car> getWinners, int i) {
        if(i != getWinners.size()-1) {
            print.append(Const.COMMA);
        }
    }

}
