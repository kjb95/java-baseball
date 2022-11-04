package baseball.model;

import java.util.List;
import java.util.stream.IntStream;

public class GameResult {

    private static final int NUM_SIZE = 3;

    private final int strikeCount;
    private final int ballCount;

    public GameResult(List<Integer> answerNums, List<Integer> playerNums) {
        strikeCount = countStrike(answerNums, playerNums);
        ballCount = countBall(answerNums, playerNums);
    }

    private int countBall(List<Integer> answerNums, List<Integer> playerNums) {
        return (int) IntStream.range(0, NUM_SIZE)
            .filter(i -> !isStrike(answerNums, playerNums, i) && answerNums.contains(playerNums.get(i)))
            .count();
    }

    private int countStrike(List<Integer> answerNums, List<Integer> playerNums) {
        return (int) IntStream.range(0, NUM_SIZE)
            .filter(i -> isStrike(answerNums, playerNums, i))
            .count();
    }

    private boolean isStrike(List<Integer> answerNums, List<Integer> playerNums, int i) {
        return answerNums.get(i) == playerNums.get(i);
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }
}
