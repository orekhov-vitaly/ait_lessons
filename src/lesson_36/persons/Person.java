package lesson_36.persons;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    // Валидация email
    private boolean isEmailValid(String email) {
        if (email == null) return false;

        // 1. Должна присутствовать и только одна @
        int indexAt = email.indexOf("@");
        int lastAt = email.lastIndexOf("@");
        if (indexAt < 0 || indexAt != lastAt) return false;

        // 2. Точка после @
        int dotIndexAfterAt = email.indexOf(".", indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // 3. После точки минимум два символа
        int lastDotIndex = email.lastIndexOf(".");
        if (lastDotIndex >= email.length() - 2) return false;

        // 4. Перебираем в цикле все символы и проверяем каждый.
        for (char ch : email.toCharArray()) {
            boolean isPast = Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '.'
                    || ch == '@'
                    || ch == '_'
                    || ch == '-';
            if (!isPast) return false;
        }

        return true;
    }

    /*
    Пароль:
    1. Минимум 8 символов.
    2. Минимум одна большая буква.
    2. Минимум одна маленька буква.
    4. Минимум одна цифра.
    5. Минимум один спецсимвол: "#@$!%&*()[],.-"
     */

    // Валидайия пароля
    private boolean isPasswordValid(String password) {
        if (password == null) return false;

        boolean checkLength = false;
        boolean checkLetter = false;
        boolean checkDigit = false;
        boolean checkSpecCharacter = false;

        if (password.length() > 7) checkLength = true;

        for (char ch : password.toCharArray()) {
            if (!checkLetter && Character.isUpperCase(ch)) checkLetter = true;

            if (!checkLetter && Character.isLowerCase(ch)) checkLetter = true;

            if (!checkDigit && Character.isDigit(ch)) checkDigit = true;

            if (!checkSpecCharacter) {
                switch (ch){
                    case '#':
                        checkSpecCharacter = true;
                        break;
                    case '@':
                        checkSpecCharacter = true;
                        break;
                    case '$':
                        checkSpecCharacter = true;
                        break;
                    case '!':
                        checkSpecCharacter = true;
                        break;
                    case '%':
                        checkSpecCharacter = true;
                        break;
                    case '&':
                        checkSpecCharacter = true;
                        break;
                    case '*':
                        checkSpecCharacter = true;
                        break;
                    case '(':
                        checkSpecCharacter = true;
                        break;
                    case ')':
                        checkSpecCharacter = true;
                        break;
                    case '[':
                        checkSpecCharacter = true;
                        break;
                    case ']':
                        checkSpecCharacter = true;
                        break;
                    case ',':
                        checkSpecCharacter = true;
                        break;
                    case '.':
                        checkSpecCharacter = true;
                        break;
                    case '-':
                        checkSpecCharacter = true;
                        break;
                }
            }
        }
        if (checkLength && checkLetter && checkDigit && checkSpecCharacter) return true;

        return false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}