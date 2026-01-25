import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        int marks[][] = new int[n][3];
        double percent[] = new double[n];
        char grade[] = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90)
                grade[i] = 'A';
            else if (percent[i] >= 75)
                grade[i] = 'B';
            else if (percent[i] >= 60)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }

        for (int i = 0; i < n; i++) {
            System.out.println(percent[i] + " " + grade[i]);
        }
    }
}
