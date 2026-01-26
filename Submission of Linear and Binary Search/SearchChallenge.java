import java.util.Scanner;
import java.util.Arrays;

public class SearchChallenge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int miss = 1;
        while (true) {
            boolean f = false;
            for (int i = 0; i < n; i++)
                if (a[i] == miss)
                    f = true;
            if (!f)
                break;
            miss++;
        }

        Arrays.sort(a);
        int t = sc.nextInt();
        int l = 0, r = n - 1, idx = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == t) {
                idx = m;
                break;
            }
            if (a[m] < t)
                l = m + 1;
            else
                r = m - 1;
        }

        System.out.println(miss);
        System.out.println(idx);
    }
}
