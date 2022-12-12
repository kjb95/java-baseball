package baseball.domain;

import baseball.constant.Constant;
import java.util.List;
import java.util.stream.IntStream;

public class BaseballNumber {

    protected List<Integer> numbers;

    public int countBall(BaseballNumber baseballNumber) {
        return (int) IntStream.range(0, Constant.BASEBALL_NUMBER_SIZE)
                .filter(numberIndex -> isBall(baseballNumber.numbers, numberIndex))
                .count();
    }

    public int countStrike(BaseballNumber baseballNumber) {
        return (int) IntStream.range(0, Constant.BASEBALL_NUMBER_SIZE)
                .filter(numberIndex -> isStrike(baseballNumber.numbers, numberIndex))
                .count();
    }

    private boolean isBall(List<Integer> targetNumbers, int numberIndex) {
        if (isStrike(targetNumbers, numberIndex)) {
            return false;
        }
        if (!targetNumbers.contains(numbers.get(numberIndex))) {
            return false;
        }
        return true;
    }

    private boolean isStrike(List<Integer> targetNumbers, int numberIndex) {
        return numbers.get(numberIndex) == targetNumbers.get(numberIndex);
    }
}
