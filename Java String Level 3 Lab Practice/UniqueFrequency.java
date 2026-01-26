import java.util.Scanner;

public class UniqueFrequency {

    public static char[] unique(String s) {
        char t[] = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int f = 0;

            for (int j = 0; j < i; j++)
                if (s.charAt(j) == ch)
                    f = 1;

            if (f == 0)
                t[k++] = ch;
        }

        char r[] = new char[k];
        for (int i = 0; i < k; i++)
            r[i] = t[i];

        return r;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char u[] = unique(s);
        int f[] = new int[256];

        for (int i = 0; i < s.length(); i++)
            f[s.charAt(i)]++;

        for (int i = 0; i < u.length; i++)
            System.out.println(u[i] + " " + f[u[i]]);
    }
}
