import java.util.Scanner;

public class StringLength {
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String text;
        System.out.print("Enter text: ");
        text = sc.next();

        int len1 = findLength(text);
        int len2 = text.length();

        System.out.println("Length without length(): " + len1);
        System.out.println("Length using length(): " + len2);
    }
}
