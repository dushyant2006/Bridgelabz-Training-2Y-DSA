import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number;
        int table[] = new int[10];
        int i;

        System.out.print("Enter number: ");
        number = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        for (i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
