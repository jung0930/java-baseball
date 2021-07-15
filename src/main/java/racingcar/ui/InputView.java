package racingcar.ui;

import racingcar.domain.Car;
import racingcar.util.Const;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public String inputNames() {
        System.out.println(Const.INPUT_CAR_NAME_MESSAGE);

        Scanner scanner = new Scanner(System.in);
        String names = scanner.next();
        checkIsNotNull(names);

        return names;
    }

    public int inputMaxRound() {
        System.out.println(Const.INPUT_TURN_MESSAGE);

        Scanner scanner = new Scanner(System.in);
        int maxRound = scanner.nextInt();
        checkIsPlus(maxRound);

        return maxRound;
    }

    private void checkIsNotNull(String names) {
        if(names.trim().isEmpty() || names.trim().length() == 0) {
            throw new IllegalArgumentException(Const.NAME_NULL_ERROR_MESAGE);
        }
    }

    private void checkIsPlus(int number) {
        if(number < 1) {
            throw new IllegalArgumentException(Const.NUMBER_NOT_PLUS_ERROR_MESAGE);
        }
    }

}
