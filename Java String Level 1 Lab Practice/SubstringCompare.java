import java.util.Scanner;

public class SubstringCompare {
    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
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
        int start, end;

        System.out.print("Enter text: ");
        text = sc.next();
        System.out.print("Enter start index: ");
        start = sc.nextInt();
        System.out.print("Enter end index: ");
        end = sc.nextInt();

        String sub1 = createSubstring(text, start, end);
        String sub2 = text.substring(start, end);

        boolean result = compareStrings(sub1, sub2);

        System.out.println("Substring using charAt(): " + sub1);
        System.out.println("Substring using built-in: " + sub2);
        System.out.println("Are both same: " + result);
    }
}
