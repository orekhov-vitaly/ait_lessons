package lesson_48.persons;

public class EmailValidateExcepcion extends Exception {
    /*
    getMessage()
    getCause()
    tostring()
    printStackeTrace()
     */

    public EmailValidateExcepcion(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "email validate exception | " + super.toString();
    }
}
