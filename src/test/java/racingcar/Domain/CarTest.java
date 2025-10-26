package racingcar.Domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    String name = "pobi";
    Car car = new Car(name);

    @Test
    @DisplayName("자동차 이름 출력 테스트")
    public void getNameTest() {
        assertThat(car.getName()).isEqualTo(name);
    }

    @Test
    @DisplayName("자동차 위치 출력 테스트")
    public void getPositionTest() {
        assertThat(car.getPosition()).isEqualTo("");
    }

    @Test
    @DisplayName("자동차 위치 수정 테스트")
    public void setPositionTest() {
        car.setPosition(car.getPosition() + '-');
        assertThat(car.getPosition()).isEqualTo("-");
    }
}
