import java.util.Scanner;

public class CalendarProgram {

    public static boolean leap(int y) {
        if (y % 400 == 0)
            return true;
        if (y % 100 == 0)
            return false;
        return y % 4 == 0;
    }

    public static int firstDay(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int y = sc.nextInt();

        String name[] = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
        };

        int days[] = {
            31,28,31,30,31,30,31,31,30,31,30,31
        };

        if (m == 2 && leap(y))
            days[1] = 29;

        System.out.println(name[m - 1] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int fd = firstDay(1, m, y);

        for (int i = 0; i < fd; i++)
            System.out.print("    ");

        for (int d = 1; d <= days[m - 1]; d++) {
            System.out.printf("%3d ", d);
            if ((d + fd) % 7 == 0)
                System.out.println();
        }
    }
}
