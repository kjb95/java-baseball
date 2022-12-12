package baseball.view;

import baseball.constant.ErrorMessage;
import java.util.Arrays;

public enum RestartSelection {
    RESTART("1"),
    QUIT("2");

    private final String selection;

    RestartSelection(String selection) {
        this.selection = selection;
    }

    public static void validate(String selection) {
        boolean isAnyMatch = Arrays.stream(RestartSelection.values())
                .anyMatch(restartSelection -> restartSelection.selection.equals(selection));
        if (!isAnyMatch) {
            throw new IllegalArgumentException(ErrorMessage.NOT_EXIST_SELECTION);
        }
    }

    public String getSelection() {
        return selection;
    }
}
