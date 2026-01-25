import java.util.Scanner;

public class StudentGrades {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        int phy[] = new int[n];
        int chem[] = new int[n];
        int math[] = new int[n];
        double percent[] = new double[n];
        char grade[] = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Physics: ");
            phy[i] = sc.nextInt();
            System.out.print("Chemistry: ");
            chem[i] = sc.nextInt();
            System.out.print("Maths: ");
            math[i] = sc.nextInt();

            if (phy[i] < 0 || chem[i] < 0 || math[i] < 0) {
                System.out.println("Invalid marks");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;

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

