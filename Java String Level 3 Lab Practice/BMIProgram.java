import java.util.Scanner;

public class BMIProgram {

    public static String[][] findBMI(double data[][]) {
        String res[][] = new String[10][4];
        int i;

        for (i = 0; i < 10; i++) {
            double w = data[i][0];
            double h = data[i][1] / 100.0;
            double bmi = w / (h * h);

            String status;
            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            res[i][0] = "" + data[i][1];
            res[i][1] = "" + data[i][0];
            res[i][2] = "" + bmi;
            res[i][3] = status;
        }
        return res;
    }

    public static void show(String r[][]) {
        int i;
        System.out.println("Height\tWeight\tBMI\tStatus");
        for (i = 0; i < 10; i++)
            System.out.println(r[i][0] + "\t" + r[i][1] + "\t" + r[i][2] + "\t" + r[i][3]);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double data[][] = new double[10][2];
        int i;

        for (i = 0; i < 10; i++) {
            System.out.print("Weight: ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height: ");
            data[i][1] = sc.nextDouble();
        }

        String r[][] = findBMI(data);
        show(r);
    }
}
