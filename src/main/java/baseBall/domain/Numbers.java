package baseBall.domain;

import java.util.*;

public class Numbers {

    private static final String SIZE_ERROR_MESSAGE = "3개의 숫자를 입력해야합니다.";
    private static final String OTHER_ERROR_MESSAGE = "모두 다른 숫자를 입력해야합니다.";
    private static final int NUMBERS_SIZE = 3;
    private final List<Number> numbers = new ArrayList<>();

    public Numbers(List<Number> numberList) {
        // 유효성 체크
        sizeCheck(numberList);
        otherCheck(numberList);

        for(Number number : numberList) {
            numbers.add(number);
        }
    }

    // 입력한 숫자가 3개인지 확인
    public void sizeCheck(List<Number> numberList) {
        if(numberList.size() != NUMBERS_SIZE) {
            throw new IllegalArgumentException(SIZE_ERROR_MESSAGE);
        }
    }

    // 입력한 숫자가 모두 다른 값인지 확인
    public void otherCheck(List<Number> numberList) {

        Set<Number> numberSet = new HashSet<Number>(numberList);

        if(numberList.size() != numberSet.size()) {
            throw new IllegalArgumentException(OTHER_ERROR_MESSAGE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numbers that = (Numbers) o;
        return numbers == that.numbers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }

}
