package racingcar.Controller;

import racingcar.Model.Car;
import racingcar.Model.Game;
import racingcar.Model.Validator;
import racingcar.View.OutputView;

import java.util.ArrayList;
import java.util.List;


public class PlayRaceController {

    private final String rawNameString;
    private final int turn;

    public PlayRaceController(String rawNameString, Integer rawTurn) {
        this.rawNameString = rawNameString;
        this.turn = rawTurn;
    }


    public void play() {
        try {
            Validator.turnNumValidate(turn);
            List<String> carNames = Validator.nameValidateAndSplit(rawNameString);

            List<Car> cars = new ArrayList<>();

            for (int i = 0; i < carNames.size(); i++) {
                cars.add(new Car(carNames.get(i)));
            }

            Game game = new Game(cars);
            for(int i =0 ; i < turn; i++) {
                game.round();
            }

        } catch (IllegalAccessException e) {
            OutputView.printError(e.getMessage());
        }


    }


}
