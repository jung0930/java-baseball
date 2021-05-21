package baseBall.domain;

public class Number {

    public static final String RANGE_ERROR_MESSAGE = "1-9 사이의 숫자만 입력 가능합니다.";
    public static final String ISNUMBER_ERROR_MESSAGE = "숫자만 입력 가능합니다.";
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;

    private final int number;

    public Number(int number) {
        this.number = number;
    }

    // 범위(1-9) 체크
    public boolean rangeCheck() {
        if(number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException(RANGE_ERROR_MESSAGE);
        }
        return true;
    }

    // 숫자인지 체크

    // 비어있거나 null인지 체크

}
