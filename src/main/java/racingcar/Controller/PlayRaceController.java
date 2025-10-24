package racingcar.Controller;

import racingcar.Model.CarNameValidater;
import racingcar.View.OutputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PlayRaceController {

    private final String rawNameString;
    private final int turn;

    public PlayRaceController(String rawNameString, Integer turn) {
        this.rawNameString = rawNameString;
        this.turn = turn;
    }


    public void play() {
        try {
            List<String> playerNames = CarNameValidater.validate(rawNameString);
        } catch (IllegalAccessException e) {
            OutputView.printError(e.getMessage());
        }


    }


}
