package view;

import java.util.Locale;
import java.util.ResourceBundle;

import static view.Messages.INPUT_STRING_DATA;
import static view.Messages.WRONG_INPUT_DATA;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("en"));
//                    new Locale("ua", "UA"));  // Ukrainian

    public void printStringInput(String message) {
        printMessage(concatString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatString(String... messages) {
        StringBuilder builder = new StringBuilder();
        for (String str: messages) {
            builder.append(str);
        }
        return builder.toString();
    }

}
