package racingcar.ui;

import racingcar.domain.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    // InputView Message
    public static final String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분), 자동차당 최대 5글자 제한입니다";
    public static final String INPUT_TURN_MESSAGE = "시도할 회수는 몇회인가요?";
    public static final String NAME_NULL_ERROR_MESAGE = "자동차 이름이 없습니다.";

    public String[] inputNames() {
        System.out.println(INPUT_CAR_NAME_MESSAGE);

        Scanner scanner = new Scanner(System.in);
        String names = scanner.next();
        checkIsNotNull(names);

        return names.split(",");
    }

    public int inputMaxRound() {
        System.out.println(INPUT_TURN_MESSAGE);

        Scanner scanner = new Scanner(System.in);
        int maxRound = scanner.nextInt();

        return maxRound;
    }

    private void checkIsNotNull(String names) {
        if(names.trim().isEmpty() || names.trim().length() == 0) {
            throw new IllegalArgumentException(NAME_NULL_ERROR_MESAGE);
        }
    }

}
