import java.util.Scanner;

public class SelectionSortScores {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, i, j, min, t;
        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        int a[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Enter score: ");
            a[i] = sc.nextInt();
        }

        for (i = 0; i < n - 1; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            t = a[min];
            a[min] = a[i];
            a[i] = t;
        }

        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
