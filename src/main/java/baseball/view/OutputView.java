package baseball.view;

import baseball.constant.Message;
import baseball.constant.MessageForm;

public class OutputView {

    public static void printStartGame() {
        System.out.println(Message.GAME_START);
    }

    public static void printGameResult(int ballCount, int strikeCount) {
        if (ballCount == 0 && strikeCount == 0) {
            printNothing();
        }
        if (ballCount == 0 && strikeCount != 0) {
            printOnlyStrike(strikeCount);
        }
        if (ballCount != 0 && strikeCount == 0) {
            printOnlyBall(ballCount);
        }
        if (ballCount != 0 && strikeCount != 0) {
            printBallAndStrike(ballCount, strikeCount);
        }
    }

    private static void printNothing() {
        System.out.println(Message.NOTHING);
    }

    private static void printOnlyStrike(int strikeCount) {
        System.out.printf(MessageForm.PRINT_ONLY_STRIKE, strikeCount);
        System.out.println();
    }

    private static void printOnlyBall(int ballCount) {
        System.out.printf(MessageForm.PRINT_ONLY_BALL, ballCount);
        System.out.println();
    }

    private static void printBallAndStrike(int ballCount, int strikeCount) {
        System.out.printf(MessageForm.PRINT_BALL_AND_STRIKE, ballCount, strikeCount);
        System.out.println();
    }

    public static void printErrorMessage(String message) {
        System.out.println();
        System.out.printf(MessageForm.ERROR_MESSAGE_FORM, message);
        System.out.println();
    }
}
