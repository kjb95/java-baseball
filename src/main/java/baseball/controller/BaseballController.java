package baseball.controller;

import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {

    public void run() {
        OutputView.printStartGame();
        String number = InputView.requestNumberBaseball();
    }
}
