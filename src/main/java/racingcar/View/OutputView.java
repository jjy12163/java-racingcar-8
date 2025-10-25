package racingcar.View;

import racingcar.Domain.Car;

import java.util.List;

import static racingcar.Service.GameResult.turnNumValidate;

public class OutputView {

    public static void printOneRound(List<Car> cars) {
        for(Car car : cars) {
            System.out.println(car.getName() + " : " + car.getPosition());
        }
        System.out.println();
    }

    public static void printFinalResult(List<Car> cars) {
        String maxPositionCars = turnNumValidate(cars);
        System.out.println("최종 우승자 : " + maxPositionCars);
    }

    public static void printError(String message) {
        System.out.println("[ERROR] " + message);
    }
}
