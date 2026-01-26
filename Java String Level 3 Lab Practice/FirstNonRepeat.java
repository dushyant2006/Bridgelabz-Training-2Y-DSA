
import java.util.Scanner;

public class FirstNonRepeat {

    public static char find(String s) {
        int freq[] = new int[256];
        int i;

        for (i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        for (i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1)
                return s.charAt(i);
        }
        return '-';
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char c = find(s);
        System.out.println(c);
    }
}
