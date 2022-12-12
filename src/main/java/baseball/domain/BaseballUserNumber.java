package baseball.domain;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BaseballUserNumber extends BaseballNumber {

    public BaseballUserNumber(String input) {
        numbers = Arrays.stream(input.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
