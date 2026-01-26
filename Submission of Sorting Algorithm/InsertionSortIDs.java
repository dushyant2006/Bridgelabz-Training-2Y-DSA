import java.util.Scanner;

public class InsertionSortIDs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, i, j, key;
        System.out.print("Enter number of employees: ");
        n = sc.nextInt();

        int a[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Enter employee ID: ");
            a[i] = sc.nextInt();
        }

        for (i = 1; i < n; i++) {
            key = a[i];
            j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
