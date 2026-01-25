import java.util.Scanner;

public class StoreAndSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double arr[] = new double[10];
        double total = 0;
        int index = 0;
        double num;

        while (true) {
            System.out.print("Enter number: ");
            num = sc.nextDouble();

            if (num <= 0)
                break;

            if (index == 10)
                break;

            arr[index] = num;
            index++;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total = total + arr[i];
        }

        System.out.println("Total = " + total);
    }
}
