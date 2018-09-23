import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String PHONE_NUMBER_REGEX = "\\([0-9]{2}\\)\\-\\([0-9]{10,11}\\)";
    private static Pattern pattern;
    private static Matcher matcher;

    public PhoneNumberExample() {
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
