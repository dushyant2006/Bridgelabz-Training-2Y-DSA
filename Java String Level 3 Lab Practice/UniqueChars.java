import java.util.Scanner;

public class UniqueChars {

    public static int findLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {
        }
        return c;
    }

    public static char[] unique(String s) {
        int n = findLength(s);
        char temp[] = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int f = 0;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch)
                    f = 1;
            }

            if (f == 0) {
                temp[k] = ch;
                k++;
            }
        }

        char res[] = new char[k];
        for (int i = 0; i < k; i++)
            res[i] = temp[i];

        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char r[] = unique(s);
        for (int i = 0; i < r.length; i++)
            System.out.print(r[i] + " ");
    }
}
