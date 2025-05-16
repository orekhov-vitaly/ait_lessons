package lesson_15;

public class StringEquals {
    public static void main(String[] args) {

        int x = 10;

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        boolean check = str1 == str2;
        System.out.println("str1 == str2: " + check);
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 == str4: " + (str1 == str4));

        boolean isEquals = str1.equals(str2);
        System.out.println(isEquals);

        isEquals = str1.equals(str3);
        System.out.println(isEquals);

        isEquals = str1.equals(str4);
        System.out.println(isEquals);

        isEquals = str2.equals(str4);
        System.out.println(isEquals);

        isEquals = str1.equalsIgnoreCase(str3);
        System.out.println(isEquals);
    }
}
