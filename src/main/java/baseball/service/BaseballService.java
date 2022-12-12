package baseball.service;

import baseball.domain.BaseballAnswerNumber;
import baseball.domain.BaseballNumberAnswerGenerator;
import baseball.dto.GameResultDto;
import java.util.List;

public class BaseballService {

    private BaseballAnswerNumber baseballAnswerNumber;

    public void createBaseballAnswerNumber() {
        List<Integer> baseballAnswerNumber = BaseballNumberAnswerGenerator.createBaseballAnswerNumber();
        this.baseballAnswerNumber = new BaseballAnswerNumber(baseballAnswerNumber);

    }

    public GameResultDto computeGameResult(String number) {
        return null;
    }


}
