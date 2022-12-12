package baseball.controller;

import baseball.constant.Constant;
import baseball.dto.GameResultDto;
import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {

    private final BaseballService baseballService = new BaseballService();

    public void run() {
        OutputView.printStartGame();
        baseballService.createBaseballAnswerNumber();
        String number = InputView.requestNumberBaseball();
        GameResultDto gameResultDto = baseballService.computeGameResult(number);
        OutputView.printGameResult(gameResultDto.getBallCount(), gameResultDto.getStrikeCount());
        if (gameResultDto.getStrikeCount() == Constant.BASEBALL_NUMBER_SIZE) {
            boolean isRestartGame = InputView.requestRestartGame();
        }
    }
}
