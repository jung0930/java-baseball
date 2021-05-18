import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    private static final int DEFAULT_NUMBER = 0;
    private static final Pattern PATTERN = Pattern.compile("//(.)\n(.*)");
    private static final String DELIMITER = ",|:";
    private static final int FIRST_MATCHER = 1;
    private static final int SECOND_MATCHER = 2;

    public int splitAndSum(String input) {
        if (isNullOrEmpty(input)) {
            return DEFAULT_NUMBER;
        }

        return getOutput(getStrings(input));
    }

    private boolean isNullOrEmpty(String input) {
        return input == null || input.isEmpty();
    }

    private String[] getStrings(String input) {
        Matcher m = PATTERN.matcher(input);
        if (m.find()) {
            String customDelimiter = m.group(FIRST_MATCHER);
            return m.group(SECOND_MATCHER).split(customDelimiter);
        }
        return input.split(DELIMITER);
    }

    private int getOutput(String[] tokens) {
        int output = DEFAULT_NUMBER;

        for (String s : tokens) {
            int num = Integer.parseInt(s);
            checkNumber(num);



            output += num;
        }

        return output;
    }

    private void checkNumber(int num) {
        if (num < DEFAULT_NUMBER) {
            throw new RuntimeException();
        }
    }


}
