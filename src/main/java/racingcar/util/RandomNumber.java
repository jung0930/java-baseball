package racingcar.util;

import java.util.Random;

public class RandomNumber {

    private static final int RANDOM_SIZE = 10;

    private static Random random = new Random();

    public static int getRandomNumber() {
        return random.nextInt(RANDOM_SIZE);
    }

}
