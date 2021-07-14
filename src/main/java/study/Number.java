package study;

public class Number {

    private static final int DEFAULT_NUMBER = 0;
    private int num;

    public Number(int num) {
        checkNumber(num);
        this.num = num;
    }

    public static Number valueOf(String number) {
        validateString(number);
        return new Number(Integer.parseInt(number));
    }

    private static void validateString(String number) {

    }

    public Number(String num) {
        this(Integer.parseInt(num));
    }

    private void checkNumber(int num) {
        if (num < DEFAULT_NUMBER) {
            throw new RuntimeException();
        }
    }

}
