package homeworks.homework_37.persons;

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
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt < 0 || indexAt != lastAt) return false;

        // 2. Точка после @, но не следующая после @
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == indexAt + 1) return false;
        if (dotIndexAfterAt == -1) return false;

        // 3. После точки минимум два символа
        int lastDotIndex = email.lastIndexOf('.');
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

        // 5. До собаки долженбыть хотя бы один символ
        if (indexAt == 0) return false;

        // 6. Первый символ должен быть буквой
        if (!Character.isLetter(email.charAt(0))) return false;

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

        System.out.println("checkLength: " + checkLength + ", isUpperCase: " + isUpperCase + ", isLowerCase: " + isLowerCase + ", isDigit: " + isDigit + ", isSpecCharacter" + isSpecCharacter);
        if (checkLength && isUpperCase && isLowerCase && isDigit && isSpecCharacter) return true;

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