import java.util.Scanner;

public class QuickSortPrices {

    public static int part(int a[], int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        int t;

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }

        t = a[i + 1];
        a[i + 1] = a[high];
        a[high] = t;

        return i + 1;
    }

    public static void sort(int a[], int low, int high) {
        if (low < high) {
            int p = part(a, low, high);
            sort(a, low, p - 1);
            sort(a, p + 1, high);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, i;
        System.out.print("Enter number of products: ");
        n = sc.nextInt();

        int a[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Enter price: ");
            a[i] = sc.nextInt();
        }

        sort(a, 0, n - 1);

        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
