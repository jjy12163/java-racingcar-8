package racingcar.Domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Game {

    private List<Car> cars;
    private int randomNum;

    public Game(List<Car> cars) {
        this.cars = cars;
    }

    public void round() {
        for(Car car : cars) {
            if(move()) {
                car.setPosition(car.getPosition() + '-');
            }
        }
    }

    private boolean move() {
        int randomNum = Randoms.pickNumberInRange(0, 9);
        if(randomNum >= 4) {
            return true;
        }
        return false;
    }
}
