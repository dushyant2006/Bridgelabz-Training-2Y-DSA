import java.util.Scanner;

public class CharFrequency {

    public static String[][] freq(String s) {
        int f[] = new int[256];
        int i, c = 0;

        for (i = 0; i < s.length(); i++)
            f[s.charAt(i)]++;

        for (i = 0; i < 256; i++)
            if (f[i] > 0)
                c++;

        String r[][] = new String[c][2];
        int k = 0;

        for (i = 0; i < 256; i++) {
            if (f[i] > 0) {
                r[k][0] = "" + (char)i;
                r[k][1] = "" + f[i];
                k++;
            }
        }
        return r;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String r[][] = freq(s);
        for (int i = 0; i < r.length; i++)
            System.out.println(r[i][0] + " " + r[i][1]);
    }
}
