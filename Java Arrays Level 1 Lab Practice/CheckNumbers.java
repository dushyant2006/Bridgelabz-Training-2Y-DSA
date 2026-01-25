import java.util.Scanner;

public class CheckNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int i;

        for (i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            a[i] = sc.nextInt();
        }

        for (i = 0; i < 5; i++) {
            if (a[i] > 0) {
                if (a[i] % 2 == 0)
                    System.out.println(a[i] + " is positive and even");
                else
                    System.out.println(a[i] + " is positive and odd");
            } else if (a[i] < 0) {
                System.out.println(a[i] + " is negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (a[0] == a[4])
            System.out.println("First and last elements are equal");
        else if (a[0] > a[4])
            System.out.println("First element is greater");
        else
            System.out.println("Last element is greater");
    }
}
