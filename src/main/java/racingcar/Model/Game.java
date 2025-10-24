package racingcar.Model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

import static racingcar.View.OutputView.printOneRound;

public class Game {

    private List<Car> cars;

    public Game(List<Car> cars) {
        this.cars = cars;
    }

    public void round() {
        for(Car car : cars) {
            String currentPosition = car.getPosition();

            int randomNum = Randoms.pickNumberInRange(0, 9);
            if(randomNum >= 4) {
                car.setPosition(currentPosition + '-');
            }
        }
        printOneRound(cars);
    }



}
