package baseBall.domain;

public enum Record {
    STRIKE("스트라이크", 2),
    BALL("볼", 1),
    NOTHING("낫싱", 0);

    private final String record;
    private final int code;

    Record(String record, int code) {
        this.record = record;
        this.code = code;
    }

    /*
    public static Record() {

    }
    */

}
