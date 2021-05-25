package baseBall.domain;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    public static final String SIZE_ERROR_MESSAGE = "3개의 숫자를 입력해야합니다.";
    public static final String OTHER_ERROR_MESSAGE = "모두 다른 숫자를 입력해야합니다.";
    public static final int SUCCESS_SIZE = 3;
    private final List<Number> numbers = new ArrayList<>();

    public void addNumber(Number number) {
        numbers.add(number);
    }

    // 입력한 숫자가 3개인지 확인
    public boolean sizeCheck() {
        if(numbers.size() != SUCCESS_SIZE) {
            throw new IllegalArgumentException(SIZE_ERROR_MESSAGE);
        }

        return true;
    }

    // 입력한 숫자가 모두 다른 값인지 확인
    public boolean otherCheck() {

        // OTHER_ERROR_MESSAGE

        for(int i = 0; i < numbers.size(); i++) {

        }

        /*
        List<Integer> list = new ArrayList<>();
        int num = numbers.get(0).getNumber();
        list.add(num);
        int index = 0;

        for(Number number : numbers) {
            if(index == 0) {
                continue;
            }

            if(num == number.getNumber()) {
                throw new IllegalArgumentException(SIZE_ERROR_MESSAGE);
            }
        }

        */

        /*
        if(numbers.size() != 3) {
            throw new IllegalArgumentException(SIZE_ERROR_MESSAGE);
        }
        */
        return true;
    }

}
