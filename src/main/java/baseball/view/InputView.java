package baseball.view;

import baseball.utils.Utils;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String RE_GAME = "1";

    public static String requestNum() {
        OutputView.printRequestNum();
        String input = Console.readLine();

        return validateRequestNum(input);
    }

    static String validateRequestNum(String input) {
        input = Utils.deleteAllSpace(input);
        return null;
    }

    public static boolean requestIsReGame() {
        OutputView.printRequestReGame();
        String input = Console.readLine();

        input = Utils.deleteAllSpace(input);
        return input.equals(RE_GAME);
    }
}
