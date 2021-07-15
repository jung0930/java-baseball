package racingcar;

import racingcar.domain.Referee;
import racingcar.ui.InputView;
import racingcar.ui.OutputView;

public class RacingGame {

    public void startGame() {
        InputView inputView = new InputView();
        OutputView outView = new OutputView();

        String userInputNames = inputView.inputNames();
        int maxRound = inputView.inputMaxRound();

        Referee referee = new Referee();
        referee.startRound(userInputNames, maxRound);

        outView.printRound(referee);
        outView.printWinner(referee);
    }

}
