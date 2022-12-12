package baseball.dto;

public class GameResultDto {

    private final int ballCount;
    private final int strikeCount;
    private final boolean isNothing;
    private final boolean isGameOver;

    public GameResultDto(int ballCount, int strikeCount, boolean isNothing, boolean isGameOver) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
        this.isNothing = isNothing;
        this.isGameOver = isGameOver;
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public boolean isNothing() {
        return isNothing;
    }

    public boolean isGameOver() {
        return isGameOver;
    }
}
