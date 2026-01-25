import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter number: ");
        number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int odd[] = new int[number / 2 + 1];
        int even[] = new int[number / 2 + 1];

        int oi = 0;
        int ei = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[ei] = i;
                ei++;
            } else {
                odd[oi] = i;
                oi++;
            }
        }

        System.out.println("Odd numbers:");
        for (int i = 0; i < oi; i++)
            System.out.print(odd[i] + " ");

        System.out.println("\nEven numbers:");
        for (int i = 0; i < ei; i++)
            System.out.print(even[i] + " ");
    }
}
