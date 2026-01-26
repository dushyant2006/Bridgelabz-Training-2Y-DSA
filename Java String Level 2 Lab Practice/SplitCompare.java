import java.util.Scanner;

public class SplitCompare {
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

    public static String[] splitWords(String text) {
        int len = findLength(text);
        int spaceCount = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ')
                spaceCount++;
        }

        String words[] = new String[spaceCount + 1];
        int start = 0;
        int index = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word = word + text.charAt(j);
                }
                words[index] = word;
                index++;
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareArrays(String a[], String b[]) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String text;
        System.out.print("Enter text: ");
        text = sc.nextLine();

        String arr1[] = splitWords(text);
        String arr2[] = text.split(" ");

        boolean result = compareArrays(arr1, arr2);
        System.out.println("Result: " + result);
    }
}
