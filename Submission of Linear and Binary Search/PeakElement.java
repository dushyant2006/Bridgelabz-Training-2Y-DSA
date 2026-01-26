import java.util.Scanner;

public class PeakElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int l = 0, r = n - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            if ((m == 0 || a[m] > a[m - 1]) &&
                (m == n - 1 || a[m] > a[m + 1])) {
                System.out.println(a[m]);
                return;
            }

            if (m > 0 && a[m] < a[m - 1])
                r = m - 1;
            else
                l = m + 1;
        }
    }
}
