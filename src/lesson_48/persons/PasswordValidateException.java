package lesson_48.persons;

public class PasswordValidateException extends Exception {
    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "password validate exception | " + super.toString();
    }
}
