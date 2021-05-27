package baseBall.domain;

public enum Result {

    STRIKE(1, "스트라이크"),
    BALL(2, "볼"),
    NOT_THING(3, "낫싱");

    private int resultCode;
    private String resultMessage;

    private Result(int resultCode, String resultMessage) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }

    public int getResultCode() {
        return resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

}
