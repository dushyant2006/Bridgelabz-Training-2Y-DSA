import java.util.Scanner;

public class ShortLongWord {
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
        int spaces = 0;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ')
                spaces++;

        String words[] = new String[spaces + 1];
        int start = 0, index = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                String w = "";
                for (int j = start; j < i; j++)
                    w = w + text.charAt(j);
                words[index++] = w;
                start = i + 1;
            }
        }
        return words;
    }

    public static int[] findShortLong(String words[]) {
        int min = findLength(words[0]);
        int max = min;
        int minI = 0, maxI = 0;

        for (int i = 1; i < words.length; i++) {
            int l = findLength(words[i]);
            if (l < min) {
                min = l;
                minI = i;
            }
            if (l > max) {
                max = l;
                maxI = i;
            }
        }
        return new int[]{minI, maxI};
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String text;
        System.out.print("Enter text: ");
        text = sc.nextLine();

        String words[] = splitWords(text);
        int res[] = findShortLong(words);

        System.out.println("Shortest: " + words[res[0]]);
        System.out.println("Longest: " + words[res[1]]);
    }
}
