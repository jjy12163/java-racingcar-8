package racingcar;

import racingcar.Controller.PlayRaceController;
import racingcar.View.InputView;

public class Application {
    public static void main(String[] args) {

        String rawNameString = InputView.readInputName();
        int rawTurn = InputView.readInputNumber();

        PlayRaceController playRaceController = new PlayRaceController(rawNameString, rawTurn);
        playRaceController.play();
    }
}
