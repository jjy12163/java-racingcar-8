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
        List<String> finalCars = turnNumValidate(cars);
        String result = String.join(", ", finalCars);
        System.out.println("최종 우승자 : " + result);
    }
}
