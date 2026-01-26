import java.util.Scanner;

public class CharFrequencyNested {

    public static String[] freq(String s) {
        char ch[] = s.toCharArray();
        int f[] = new int[ch.length];
        int i, j, c = 0;

        for (i = 0; i < ch.length; i++) {
            f[i] = 1;
            for (j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    f[i]++;
                    ch[j] = '0';
                }
            }
        }

        for (i = 0; i < ch.length; i++)
            if (ch[i] != '0')
                c++;

        String r[] = new String[c];
        int k = 0;

        for (i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                r[k] = ch[i] + " " + f[i];
                k++;
            }
        }
        return r;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String r[] = freq(s);
        for (int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }
}
