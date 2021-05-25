package baseBall.domain;

import java.util.ArrayList;
import java.util.List;

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

        // OTHER_ERROR_MESSAGE

        for(int i = 0; i < NUMBERS_SIZE; i++) {
            for(int j = 1; j < NUMBERS_SIZE; j++) {



            }
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
    }

}
