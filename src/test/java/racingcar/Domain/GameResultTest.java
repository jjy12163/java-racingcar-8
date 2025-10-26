package racingcar.Domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.Service.GameResult;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameResultTest {

    @Test
    @DisplayName("자동차 이름 출력 테스트")
    public void getNameTest() {

        List<String> carNames = new ArrayList<>();
        carNames.add("pobi");
        carNames.add("woni");
        carNames.add("jun");

        List<Car> cars = new ArrayList<>();

        for (String carName : carNames) {
            Car car = new Car(carName);
            cars.add(car);
        }

        Car pobi = cars.get(0);
        Car woni = cars.get(1);
        pobi.setPosition("-");
        woni.setPosition("-");

        List<String> answer = new ArrayList<>();
        answer.add("pobi");
        answer.add("woni");

        List<String> gameResult = GameResult.turnNumValidate(cars);
        assertThat(gameResult).isEqualTo(answer);
    }
}
