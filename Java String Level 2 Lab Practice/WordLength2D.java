import java.util.Scanner;

public class WordLength2D {
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

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ')
                spaces++;
        }

        String words[] = new String[spaces + 1];
        int start = 0;
        int index = 0;

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

    public static String[][] create2D(String words[]) {
        String result[][] = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String text;
        System.out.print("Enter text: ");
        text = sc.nextLine();

        String words[] = splitWords(text);
        String table[][] = create2D(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }
}
