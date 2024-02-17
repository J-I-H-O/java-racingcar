package racingcar.domain;

import java.util.Collections;
import java.util.List;

public class CarRacingGame {
    private final Cars cars;
    private final Round round;

    public CarRacingGame(Cars cars, Round round) {
        this.cars = cars;
        this.round = round;
    }

    public List<Car> findWinners() {
        return cars.findCarsAtMaxPosition();
    }

    public boolean isGameEnd() {
        return round.isLast();
    }

    public void playRound(NumberGenerator numberGenerator) {
        cars.moveCars(numberGenerator);
        round.decrease();
    }

    public List<Car> getCurrentCarStatuses() {
        return Collections.unmodifiableList(cars.getCars());
    }
}
