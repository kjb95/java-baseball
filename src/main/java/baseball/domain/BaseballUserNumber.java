package baseball.domain;

import baseball.constant.Constant;
import baseball.constant.ErrorMessage;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BaseballUserNumber extends BaseballNumber {

    public BaseballUserNumber(String input) {
        numbers = Arrays.stream(input.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        validateDuplicate();
    }

    private void validateDuplicate() {
        if (isDuplicateBaseballNumber()) {
            throw new IllegalArgumentException(ErrorMessage.DUPLICATE_NUMBER_EXIST);
        }
    }

    private boolean isDuplicateBaseballNumber() {
        return numbers.stream()
                .distinct()
                .count() != Constant.BASEBALL_NUMBER_SIZE;
    }
}
