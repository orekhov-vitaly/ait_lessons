package lesson_48;

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionsExample {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        try {
            // array[10] = 100;
            System.out.println("Try continue 1");
            int x = array[2] / 0;
            System.out.println("Try continue 2");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayException: " + exception.getMessage());
        } catch (Exception ex) {
            System.out.println("Error!");
            ex.printStackTrace();
            System.out.println("Exception: " + ex.getMessage());
        } finally {
            System.out.println("finally");
        }

        System.out.println("continue program");
        System.err.println("Print in stream error");

        String result = getUrlString();

        String result2;
        try {
            result2 = getUrlString2();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getUrlString2() throws MalformedURLException {
        URL url = new URL("htt://example.com");
        return url.toString();
    }

    private static String getUrlString() {
        URL myUrl;

        try {
            myUrl = new URL("http://example.com");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
            return "http://google.com";
        }

        return myUrl.toString();
    }
}
