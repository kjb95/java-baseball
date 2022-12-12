package baseball.service;

import baseball.domain.BaseballAnswerNumber;
import baseball.domain.BaseballNumberAnswerGenerator;
import baseball.domain.BaseballUserNumber;
import baseball.dto.GameResultDto;
import java.util.List;

public class BaseballService {

    private BaseballAnswerNumber baseballAnswerNumber;

    public void createBaseballAnswerNumber() {
        List<Integer> baseballAnswerNumber = BaseballNumberAnswerGenerator.createBaseballAnswerNumber();
        System.out.println(baseballAnswerNumber);
        this.baseballAnswerNumber = new BaseballAnswerNumber(baseballAnswerNumber);
    }

    public GameResultDto computeGameResult(String number) {
        BaseballUserNumber baseballUserNumber = new BaseballUserNumber(number);
        int ballCount = baseballAnswerNumber.countBall(baseballUserNumber);
        int strikeCount = baseballAnswerNumber.countStrike(baseballUserNumber);
        return new GameResultDto(ballCount, strikeCount);
    }


}
