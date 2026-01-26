import java.util.Scanner;

public class UppercaseCompare {
    public static String toUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                ch = (char) (ch - 32);

            result = result + ch;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String text;
        System.out.print("Enter text: ");
        text = sc.nextLine();

        String upper1 = toUpper(text);
        String upper2 = text.toUpperCase();

        boolean result = compareStrings(upper1, upper2);
        System.out.println("Result: " + result);
    }
}
