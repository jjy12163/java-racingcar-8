package racingcar.Model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    @DisplayName("Game 테스트")
    public void roundTest() {
        List<String> carNames = new ArrayList<>();
        carNames.add("pobi");
        carNames.add("woni");
        carNames.add("jun");

        List<Car> cars = new ArrayList<>();

        for(String carName : carNames) {
            Car car = new Car(carName);
            cars.add(car);
        }
        Game game = new Game(cars);
        game.round();
    }

}
