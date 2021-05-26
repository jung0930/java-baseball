package baseBall.domain;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {

    private static final String RANGE_ERROR_MESSAGE = "1-9 사이의 숫자만 입력 가능합니다.";
    private static final String ISNUMBER_ERROR_MESSAGE = "숫자만 입력 가능합니다.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private static final Pattern PATTERN = Pattern.compile("^\\-?[0-9]\\d{0,2}$");

    private final int number;

    public Number(int number) {
        validateNumber(number);

        this.number = number;
    }

    private void validateNumber(int number) {
        checkIsNumber(number);
        checkNumberRange(number);
    }

    private void checkIsNumber(int number) {
        Matcher m = PATTERN.matcher(Integer.toString(number));
        if(!m.find()) {
            throw new IllegalArgumentException(ISNUMBER_ERROR_MESSAGE);
        }
    }

    private void checkNumberRange(int number) {
        if(number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException(RANGE_ERROR_MESSAGE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number that = (Number) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

}
