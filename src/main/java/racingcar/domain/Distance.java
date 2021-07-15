package racingcar.domain;

public class Distance {

    private final int distance;

    public Distance() {
        this.distance = 0;
    }

    public Distance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public Distance addDistance() {
        return new Distance(distance + 1);
    }

}
