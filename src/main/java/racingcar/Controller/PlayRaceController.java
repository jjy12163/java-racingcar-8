package racingcar.Controller;

import racingcar.Model.Validater;
import racingcar.View.OutputView;

import java.util.List;


public class PlayRaceController {

    private final String rawNameString;
    private final int rawTurn;

    public PlayRaceController(String rawNameString, Integer rawTurn) {
        this.rawNameString = rawNameString;
        this.rawTurn = rawTurn;
    }


    public void play() {
        try {
            Validater.turnNumValidate(rawTurn);
            List<String> playerNames = Validater.nameValidateAndSplit(rawNameString);






        } catch (IllegalAccessException e) {
            OutputView.printError(e.getMessage());
        }


    }


}
