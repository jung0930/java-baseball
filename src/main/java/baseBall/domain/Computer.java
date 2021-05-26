package baseBall.domain;

import java.util.List;

public class Computer {

    private final Numbers numbers;

    public Computer(List<Number> numberList) {
        numbers = new Numbers(numberList);
    }
}
