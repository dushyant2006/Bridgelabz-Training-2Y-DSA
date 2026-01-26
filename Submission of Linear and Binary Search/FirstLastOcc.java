import java.util.Scanner;

public class FirstLastOcc {
    static int find(int a[], int t, boolean first) {
        int l = 0, r = a.length - 1, res = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == t) {
                res = m;
                if (first)
                    r = m - 1;
                else
                    l = m + 1;
            } else if (a[m] < t)
                l = m + 1;
            else
                r = m - 1;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int t = sc.nextInt();

        System.out.println(find(a, t, true));
        System.out.println(find(a, t, false));
    }
}
