package baseball.utils;

import java.util.regex.Pattern;

public class Utils {

    public static final String NUMBER_REGEX = "^[0-9]+$";

    public static boolean isNumber(String input) {
        return Pattern.matches(NUMBER_REGEX, input);
    }

    //    public static <T> T exceptionHandlingRepeat(Supplier<T> supplier, Consumer<String> printErrorFunction) {
    //        try {
    //            return supplier.get();
    //        } catch (IllegalArgumentException e) {
    //            printErrorFunction.accept(e.getMessage());
    //            return exceptionHandlingRepeat(supplier, printErrorFunction);
    //        }
    //    }
}
