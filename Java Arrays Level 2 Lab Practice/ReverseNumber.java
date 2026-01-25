import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number;
        int count = 0;
        int temp;

        System.out.print("Enter number: ");
        number = sc.nextInt();

        temp = number;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int digits[] = new int[count];
        int rev[] = new int[count];

        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }

        for (int i = 0; i < count; i++) {
            rev[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++)
            System.out.print(rev[i]);
    }
}
