package racingcar.util;

public class Const {

    // Car
    public static final int CAR_NAME_MIN_LENGTH = 1;
    public static final int CAR_NAME_MAX_LENGTH = 5;
    public static final String NAME_LENGTH_ERROR_MESSAGE = "1-5 자리의 이름만 입력 가능합니다.";
    public static final String NAME_NULL_ERROR_MESSAGE = "이름을 입력해주세요.";
    public static final String NUMBER_RANGE_ERROR_MESSAGE = "1-9 숫자만 들어올수있습니다.";
    public static final int CAR_MOVING_NUMBER = 4;

    // Cars
    public final static int MIN_CARS_SIZE = 2;
    public final static String SIZE_CHECK_ERROR_MESSAGE = "자동차는 2대 이상 입력해주세요.";
    public final static String SAME_NAME_ERROR_MESSAGE = "자동차 이름은 중복으로 입력할 수 없습니다.";

    // InputView
    public static final String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분), 자동차당 최대 5글자 제한입니다";
    public static final String INPUT_TURN_MESSAGE = "시도할 회수는 몇회인가요?";
    public static final String NAME_NULL_ERROR_MESAGE = "자동차 이름이 없습니다.";
    public static final String NUMBER_NOT_PLUS_ERROR_MESAGE = "횟수는 0보다 커야합니다.";

    // OutputView
    public static final String RESULT_RACING_END_MESSAGE = "경기 결과";
    public static final String RESULT_RACING_WINNER_MESSAGE = "가 최종 우승했습니다.";
    public static final String COMMA = ",";

}
