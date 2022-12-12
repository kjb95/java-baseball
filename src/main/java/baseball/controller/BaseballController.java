package baseball.controller;

import baseball.constant.Constant;
import baseball.dto.GameResultDto;
import baseball.service.BaseballService;
import baseball.utils.Utils;
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

    private boolean playGame() {
        boolean isGameOver = false;
        baseballService.createBaseballAnswerNumber();
        while (!isGameOver) {
            Utils.exceptionHandlingRepeatSelf(this::requestBaseballNumber, OutputView::printErrorMessage);
            isGameOver = requestBaseballNumber();
        }
        return InputView.requestRestartGame();
    }

    private boolean requestBaseballNumber() {
        String number = Utils.requestInput(InputView::requestNumberBaseball, OutputView::printErrorMessage);
        GameResultDto gameResultDto = baseballService.computeGameResult(number);
        OutputView.printGameResult(gameResultDto.getBallCount(), gameResultDto.getStrikeCount());
        return gameResultDto.getStrikeCount() == Constant.BASEBALL_NUMBER_SIZE;
    }
}
