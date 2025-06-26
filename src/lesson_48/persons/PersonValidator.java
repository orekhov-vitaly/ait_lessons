package lesson_48.persons;

public class PersonValidator {
    public static void isEmailValid(String email) throws EmailValidateExcepcion {
        if (email == null) throw new EmailValidateExcepcion("Email should be not null");

        // 1. Должна присутствовать и только одна @
        int indexAt = email.indexOf("@");
        int lastAt = email.lastIndexOf("@");
        if (indexAt < 0 || indexAt != lastAt) throw new EmailValidateExcepcion("@ error");

        // 2. Точка после @
        int dotIndexAfterAt = email.indexOf(".", indexAt + 1);
        if (dotIndexAfterAt == -1) throw new EmailValidateExcepcion(". after @ error");

        // 3. После точки минимум два символа
        int lastDotIndex = email.lastIndexOf(".");
        if (lastDotIndex >= email.length() - 2) throw new EmailValidateExcepcion("Last . error");

        // 4. Перебираем в цикле все символы и проверяем каждый.
        for (char ch : email.toCharArray()) {
            boolean isPast = Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '.'
                    || ch == '@'
                    || ch == '_'
                    || ch == '-';
            if (!isPast) throw new EmailValidateExcepcion("Illegal symbol");
        }

        // 5. До собаки долженбыть хотя бы один символ
        if (indexAt == 0) throw new EmailValidateExcepcion("@ should be not first");

        // 6. Первый символ должен быть буквой
        if (!Character.isLetter(email.charAt(0))) throw new EmailValidateExcepcion("First symbol should be letter");
    }

    public static void isPasswordValid(String password) throws PasswordValidateException{
        if (password == null) throw new PasswordValidateException("Password should be not null");

        boolean checkLength = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isDigit = false;
        boolean isSpecCharacter = false;

        if (password.length() > 7) checkLength = true;

        for (char ch : password.toCharArray()) {
            if (!isUpperCase && Character.isUpperCase(ch)) isUpperCase = true;

            if (!isLowerCase && Character.isLowerCase(ch)) isLowerCase = true;

            if (!isDigit && Character.isDigit(ch)) isDigit = true;

            if (!isSpecCharacter) {
                switch (ch){
                    case '#':
                        isSpecCharacter = true;
                        break;
                    case '@':
                        isSpecCharacter = true;
                        break;
                    case '$':
                        isSpecCharacter = true;
                        break;
                    case '!':
                        isSpecCharacter = true;
                        break;
                    case '%':
                        isSpecCharacter = true;
                        break;
                    case '&':
                        isSpecCharacter = true;
                        break;
                    case '*':
                        isSpecCharacter = true;
                        break;
                    case '(':
                        isSpecCharacter = true;
                        break;
                    case ')':
                        isSpecCharacter = true;
                        break;
                    case '[':
                        isSpecCharacter = true;
                        break;
                    case ']':
                        isSpecCharacter = true;
                        break;
                    case ',':
                        isSpecCharacter = true;
                        break;
                    case '.':
                        isSpecCharacter = true;
                        break;
                    case '-':
                        isSpecCharacter = true;
                        break;
                }
            }
        }
        if (!checkLength) throw new PasswordValidateException("Illegal length");
        if (!isUpperCase) throw new PasswordValidateException("isUpperCase");
        if (!isLowerCase) throw new PasswordValidateException("isLowerCase");
        if (!isDigit) throw new PasswordValidateException("isDigit");
        if (!isSpecCharacter) throw new PasswordValidateException("isSpecCharacter");
    }
}
