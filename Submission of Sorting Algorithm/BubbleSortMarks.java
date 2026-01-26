import java.util.Scanner;

public class BubbleSortMarks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, i, j, t;
        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        int a[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Enter marks: ");
            a[i] = sc.nextInt();
        }

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
