package racingcar;

import racingcar.Controller.PlayRaceController;
import racingcar.View.InputView;

public class Application {
    public static void main(String[] args) {

        PlayRaceController playRaceController = new PlayRaceController(InputView.readInputName(), InputView.readInputNumber());




    }
}
