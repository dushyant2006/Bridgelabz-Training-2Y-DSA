import java.util.Scanner;

public class MeanHeight {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double heights[] = new double[11];
        double sum = 0;
        double mean;
        int i;

        for (i = 0; i < 11; i++) {
            System.out.print("Enter height: ");
            heights[i] = sc.nextDouble();
        }

        for (i = 0; i < 11; i++) {
            sum = sum + heights[i];
        }

        mean = sum / 11;
        System.out.println("Mean height = " + mean);
    }
}
