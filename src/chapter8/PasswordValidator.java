package chapter8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private final int LENGTH = 8;
    private String username;
    private String currentPassword;
    private String newPassword;

    private String message = "\n";

    public PasswordValidator(String username, String currentPassword, String newPassword) {
        this.username = username;
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
    }

    public boolean isEightCharactersLong() {
        return newPassword.length() >= LENGTH;
    }

    public boolean hasUpperCase() {
        String regexCheckUpperCase = ".*[A-Z].*";
        return newPassword.matches(regexCheckUpperCase);
    }

    public boolean hasSpecialChar() {
        Pattern pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(newPassword);
        return match.find();
    }

    public boolean containUsername() {
        return newPassword.toLowerCase().contains(username.toLowerCase());
    }

    public boolean equalOldPassword() {
        return newPassword.equals(currentPassword);
    }

    public String validPassword() {
        if (!isEightCharactersLong()) {
            return "Must have 8 characters";

        } else if (!hasUpperCase()) {
            return "Must have an uppercase letter";

        } else if (!hasSpecialChar()) {
            return "Must have a special letter";

        } else if (containUsername()) {
            return "Must not contain the username";

        } else if (equalOldPassword()) {
            return "Must not be the same as the old password";
        } else {
            return "Valid password";
        }
    }

    public static void main(String[] args) {
        PasswordValidator passwordValidator =
                new PasswordValidator("Mathp", "Math123!!", "KKath123!!");

        System.out.println(passwordValidator.validPassword());
    }
}
