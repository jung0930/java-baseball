package baseBall.domain;

import java.util.Random;

public class Numbers {


    private static final int NUMBERS_SIZE = 3;
    private static final int NUMBER_MIN = 1;
    private static final int NUMBER_MAX = 9;
    private final String[] NUMBERS = new String[3];

    public String[] createNumbers() {
        for(int i = 0; i < NUMBERS.length; i++) {
            NUMBERS[i] = GetRandomNumber();
        }

        return NUMBERS;
    }

    private String GetRandomNumber() {
        int randomNumber = (int) ((Math.random() * (NUMBER_MAX - NUMBER_MIN)) + NUMBER_MAX);
        return Integer.toString(randomNumber);
    }

}
