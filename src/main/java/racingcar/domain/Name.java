package racingcar.domain;

import racingcar.util.Const;

public class Name {

    private final String name;

    public Name (String name) {
        name = name.trim();
        checkNameNotNull(name.trim());
        checkNameLength(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void checkNameNotNull(String name) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException(Const.NAME_NULL_ERROR_MESSAGE);
        }
    }

    private void checkNameLength(String name) {
        if(!(name.length() <= Const.CAR_NAME_MAX_LENGTH) || !(name.length() >= Const.CAR_NAME_MIN_LENGTH)) {
            throw new IllegalArgumentException(Const.NAME_LENGTH_ERROR_MESSAGE);
        }
    }

}
