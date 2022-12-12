package baseball.view;

import baseball.constant.Constant;
import baseball.constant.ErrorMessage;
import baseball.constant.Message;
import baseball.utils.Utils;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String requestNumberBaseball() {
        System.out.print(Message.REQUEST_NUMBER);
        String input = Console.readLine();
        validateNumberBaseball(input);
        return input;
    }

    private static void validateNumberBaseball(String input) {
        if (!Utils.isNumber(input)) {
            throw new IllegalArgumentException(ErrorMessage.NOT_NUMBER);
        }
        if (input.length() != Constant.BASEBALL_NUMBER_SIZE) {
            throw new IllegalArgumentException(ErrorMessage.WRONG_BASEBALL_NUMBER_SIZE);
        }
        if (input.contains(Constant.BASEBALL_NUMBER_ZERO)) {
            throw new IllegalArgumentException(ErrorMessage.ZERO_MUST_NOT_EXIST);
        }
    }

    public static boolean requestRestartGame() {
        System.out.println(Message.GAME_OVER);
        System.out.println(Message.REQUEST_RESTART_GAME);
        String input = Console.readLine();
        RestartSelection.validate(input);
        return input.equals(RestartSelection.RESTART.getSelection());
    }
}
