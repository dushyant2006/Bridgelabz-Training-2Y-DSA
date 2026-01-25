import java.util.Scanner;

public class Copy2Dto1D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int rows, cols;
        System.out.print("Enter rows: ");
        rows = sc.nextInt();
        System.out.print("Enter columns: ");
        cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];
        int array[] = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        System.out.println("1D Array:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
