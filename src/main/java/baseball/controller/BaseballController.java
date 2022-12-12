package baseball.controller;

import baseball.constant.Constant;
import baseball.dto.GameResultDto;
import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {

    private final BaseballService baseballService = new BaseballService();

    public void run() {
        boolean isRestart = true;
        OutputView.printStartGame();
        while (isRestart) {
            isRestart = playGame();
        }
    }

    public boolean playGame() {
        boolean isGameOver = false;
        baseballService.createBaseballAnswerNumber();
        while (!isGameOver) {
            String number = InputView.requestNumberBaseball();
            GameResultDto gameResultDto = baseballService.computeGameResult(number);
            OutputView.printGameResult(gameResultDto.getBallCount(), gameResultDto.getStrikeCount());
            isGameOver = gameResultDto.getStrikeCount() == Constant.BASEBALL_NUMBER_SIZE;
        }
        return InputView.requestRestartGame();
    }
}
