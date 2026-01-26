import java.util.Scanner;

public class TrimSpaces {
    public static int[] findTrimPoints(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (text.charAt(start) == ' ')
            start++;

        while (text.charAt(end) == ' ')
            end--;

        return new int[]{start, end + 1};
    }

    public static String substring(String text, int s, int e) {
        String result = "";
        for (int i = s; i < e; i++)
            result = result + text.charAt(i);
        return result;
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                return false;

        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String text;
        System.out.print("Enter text: ");
        text = sc.nextLine();

        int p[] = findTrimPoints(text);
        String t1 = substring(text, p[0], p[1]);
        String t2 = text.trim();

        System.out.println("Result: " + compare(t1, t2));
    }
}
