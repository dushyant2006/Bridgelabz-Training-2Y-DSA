import java.util.Scanner;

public class CountingSortAges {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, i;
        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        int a[] = new int[n];
        int count[] = new int[19];

        for (i = 0; i < n; i++) {
            System.out.print("Enter age (10 to 18): ");
            a[i] = sc.nextInt();
            count[a[i]]++;
        }

        for (i = 10; i <= 18; i++) {
            while (count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;
            }
        }
    }
}
