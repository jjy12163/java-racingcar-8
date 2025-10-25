package racingcar.Service;

import racingcar.Domain.Car;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GameResult {

    public static String turnNumValidate(List<Car> cars) {
        String maxPositionCars = cars.stream()
                .max(Comparator.comparing(Car::getPosition))
                .map(Car::getName)
                .stream().collect(Collectors.joining(", "));
        return maxPositionCars;
    };
}
