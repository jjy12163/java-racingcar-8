package racingcar.Controller;

import racingcar.Domain.Car;
import racingcar.Domain.Game;
import racingcar.Service.Validator;
import racingcar.View.OutputView;

import java.util.ArrayList;
import java.util.List;

import static racingcar.View.OutputView.printFinalResult;
import static racingcar.View.OutputView.printOneRound;

public class PlayRaceController {

    private final String rawNameString;
    private final String rawTurn;

    public PlayRaceController(String rawNameString, String rawTurn) {
        this.rawNameString = rawNameString;
        this.rawTurn = rawTurn;
    }

    public void play() {
        int turn = Validator.turnNumValidate(rawTurn);
        List<String> carNames = Validator.nameValidateAndSplit(rawNameString);

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < carNames.size(); i++) {
            cars.add(new Car(carNames.get(i)));
        }

        Game game = new Game(cars);
        for(int i =0 ; i < turn; i++) {
            game.round();
            printOneRound(cars);
        }

        printFinalResult(cars);
    }
}
