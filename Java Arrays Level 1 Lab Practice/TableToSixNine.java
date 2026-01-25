import java.util.Scanner;

public class TableToSixNine {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number;
        int result[] = new int[4];
        int i;

        System.out.print("Enter number: ");
        number = sc.nextInt();

        for (i = 6; i <= 9; i++) {
            result[i - 6] = number * i;
        }

        for (i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[i - 6]);
        }
    }
}
