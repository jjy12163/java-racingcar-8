package racingcar.View;

import racingcar.Model.Car;

import java.util.List;

public class OutputView {

    public static void printOneRound(List<Car> cars) {
        for(Car car : cars) {
            System.out.println(car.getName() + " : " + car.getPosition());
        }
        System.out.println("\n");
    }

    public static void printError(String message) {
        System.out.println("[ERROR] " + message);
    }
}
