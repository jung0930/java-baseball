package racingcar.domain;

import baseBall.domain.Ball;
import racingcar.util.RandomNumber;

import java.util.*;
import java.util.stream.Collectors;

public class Cars {

    // carList final 처리
    // public Cars(String[] carNames) { -> List로 받을것

    /*final */List<Car> carList = new ArrayList<>();
    public final static int MIN_CARS_SIZE = 2;
    public final static String SIZE_CHECK_ERROR_MESSAGE = "자동차는 2대 이상 입력해주세요.";
    public final static String SAME_NAME_ERROR_MESSAGE = "자동차 이름은 중복으로 입력할 수 없습니다.";

    public Cars(String[] carNames) {
        // 자동차가 1대 이상 입력됐는지 체크
        checkCarsSize(Arrays.asList(carNames));
        // 같은 값 체크
        checkSameCarName(Arrays.asList(carNames));

        // for문 돌려서 List에 넣어주기
        for(String carName : carNames) {
            carList.add(new Car(carName));
        }
    }

    public Cars(List<Car> carList) {
        this.carList = new ArrayList<>();
    }

    public int getCarsSize() {
        return carList.size();
    }

    public List<Car> getCars() {
        return this.carList;
    }

    public Car findCarByName(String name) {
        Car returnCar = null;
        for(Car car : carList) {
            returnCar = compareName(name, car);
        }
        return returnCar;
    }

    private Car compareName(String name, Car car) {
        if(car.getName().equals(name)) {
            return car;
        }
        return null;
    }

    private void checkCarsSize(List<String> carNames) {
        if(carNames.size() < MIN_CARS_SIZE) {
            throw new IllegalArgumentException(SIZE_CHECK_ERROR_MESSAGE);
        }
    }

    private void checkSameCarName(List<String> carNames) {
        Set<String> carSet = new HashSet<>();
        carSet.addAll(carNames);

        if(carSet.size() != carNames.size()) {
            throw new IllegalArgumentException(SAME_NAME_ERROR_MESSAGE);
        }
    }

    public Cars runCars() {
        List<Car> movedCars = new ArrayList<>();

        /*
        return new Car(carList.stream()
               .map(Car::moveCar)
               .collect(Collectors.toList()));
        */

        for (Car car : carList) {
            movedCars.add(car.moveCar());
        }

        return new Cars(movedCars);
    }

    public List<Car> getCar() {
        return carList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return Objects.equals(carList, cars.carList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carList);
    }
}
