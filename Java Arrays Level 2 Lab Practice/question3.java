import java.util.Scanner;

public class question3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int age[] = new int[3];
        double height[] = new double[3];

        int i;
        int youngest;
        double tallest;

        for (i = 0; i < 3; i++) {
            System.out.print("Enter age: ");
            age[i] = sc.nextInt();
            System.out.print("Enter height: ");
            height[i] = sc.nextDouble();
        }

        youngest = age[0];
        tallest = height[0];

        for (i = 1; i < 3; i++) {
            if (age[i] < youngest)
                youngest = age[i];

            if (height[i] > tallest)
                tallest = height[i];
        }

        System.out.println("Youngest age = " + youngest);
        System.out.println("Tallest height = " + tallest);
    }
}