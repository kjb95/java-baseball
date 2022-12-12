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

    private boolean playGame() {
        boolean isGameOver = false;
        baseballService.createBaseballAnswerNumber();
        while (!isGameOver) {
            //            isGameOver = Utils.exceptionHandlingRepeat(this::requestBaseballNumber, OutputView::printErrorMessage);
            isGameOver = requestBaseballNumber();
        }
        return InputView.requestRestartGame();
    }

    private boolean requestBaseballNumber() {
        //        String number = Utils.exceptionHandlingRepeat(InputView::requestNumberBaseball, OutputView::printErrorMessage);
        String number = InputView.requestNumberBaseball();
        GameResultDto gameResultDto = baseballService.computeGameResult(number);
        OutputView.printGameResult(gameResultDto.getBallCount(), gameResultDto.getStrikeCount());
        return gameResultDto.getStrikeCount() == Constant.BASEBALL_NUMBER_SIZE;
    }
}
