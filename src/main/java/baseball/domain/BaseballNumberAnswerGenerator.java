package baseball.domain;

import baseball.constant.Constant;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class BaseballNumberAnswerGenerator {

    public static List<Integer> createBaseballAnswerNumber() {
        List<Integer> baseballAnswerNumber = new ArrayList<>();
        while (baseballAnswerNumber.size() != Constant.BASEBALL_NUMBER_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(Constant.BASEBALL_NUMBER_MIN, Constant.BASEBALL_NUMBER_MAX);
            if (baseballAnswerNumber.contains(randomNumber)) {
                continue;
            }
            baseballAnswerNumber.add(randomNumber);
        }
        return baseballAnswerNumber;
    }
}
