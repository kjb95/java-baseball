package baseball.utils;

import java.util.regex.Pattern;

public class Utils {

    public static final String NUMBER_REGEX = "^[0-9]+$";

    public static boolean isNumber(String input) {
        return Pattern.matches(NUMBER_REGEX, input);
    }

    //    public static <T> T requestInput(Supplier<T> requestInputFunction, Consumer<String> printErrorFunction) {
    //        try {
    //            return requestInputFunction.get();
    //        } catch (IllegalArgumentException e) {
    //            printErrorFunction.accept(e.getMessage());
    //            return requestInput(requestInputFunction, printErrorFunction);
    //        }
    //    }
    //
    //    public static <T> T exceptionHandlingRepeatSelf(Supplier<T> supplier, Consumer<String> printErrorFunction) {
    //        try {
    //            return supplier.get();
    //        } catch (IllegalArgumentException e) {
    //            printErrorFunction.accept(e.getMessage());
    //            return exceptionHandlingRepeatSelf(supplier, printErrorFunction);
    //        }
    //    }
}
