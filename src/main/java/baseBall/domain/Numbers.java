package baseBall.domain;

import java.util.List;

public class Numbers {

    public static final String SIZE_ERROR_MESSAGE = "3개의 숫자를 입력해야합니다.";
    public static final String OTHER_ERROR_MESSAGE = "모두 다른 숫자를 입력해야합니다.";
    private final List<Number> numbers;

    public Numbers(List<Number> numbers) {
        this.numbers = numbers;
    }

    // 입력한 숫자가 3개인지 확인
    public boolean sizeCheck() {
        if(numbers.size() != 3) {
            throw new IllegalArgumentException(SIZE_ERROR_MESSAGE);
        }

        return true;
    }

    // 입력한 숫자가 모두 다른 값인지 확인
    public boolean otherCheck() {

        for(Number number : numbers) {
        }

        // OTHER_ERROR_MESSAGE
        if(numbers.size() != 3) {
            throw new IllegalArgumentException(SIZE_ERROR_MESSAGE);
        }

        return true;
    }

}
