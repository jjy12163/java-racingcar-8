package racingcar.Service;

import racingcar.Domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class GameResult {

    public static List<String> turnNumValidate(List<Car> cars) {
        int maxPositionLength = cars.stream()
                .mapToInt(car -> car.getPosition().length())
                .max()
                .orElse(0);

        return cars.stream()
                .filter(car -> car.getPosition().length() == maxPositionLength)
                .map(car -> car.getName())
                .collect(Collectors.toList());
    };
}
