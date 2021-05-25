package baseBall.domain;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {

    private static final String RANGE_ERROR_MESSAGE = "1-9 사이의 숫자만 입력 가능합니다.";
    private static final String ISNUMBER_ERROR_MESSAGE = "숫자만 입력 가능합니다.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

    private final int number;

    public Number(int number) {
        // 유효성 체크
        rangeCheck(number);

        this.number = number;
    }

    public Number(String strNumber) {
        // 유효성 체크
        int number = isNumberCheck(strNumber);
        rangeCheck(number);

        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    // 범위(1-9) 체크
    private void rangeCheck(int number) {
        if(number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException(RANGE_ERROR_MESSAGE);
        }
    }

    // 숫자인지 체크
    private int isNumberCheck(Object obj) {
        try {
            Integer number = Integer.parseInt((String)obj);

            Matcher m = PATTERN.matcher(Integer.toString(number));

            if(!m.find()) {
                throw new IllegalArgumentException(ISNUMBER_ERROR_MESSAGE);
            }

            return number;

        }catch(Exception e) {
            throw new IllegalArgumentException(ISNUMBER_ERROR_MESSAGE);
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
