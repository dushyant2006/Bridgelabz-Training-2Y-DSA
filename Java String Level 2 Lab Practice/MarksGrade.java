public class MarksGrade {

    public static int[][] getMarks(int n) {
        int m[][] = new int[n][3];
        int i;

        for (i = 0; i < n; i++) {
            m[i][0] = (int)(Math.random() * 90) + 10;
            m[i][1] = (int)(Math.random() * 90) + 10;
            m[i][2] = (int)(Math.random() * 90) + 10;
        }
        return m;
    }

    public static double[][] getResult(int m[][]) {
        double r[][] = new double[m.length][3];
        int i;

        for (i = 0; i < m.length; i++) {
            int t = m[i][0] + m[i][1] + m[i][2];
            double a = t / 3.0;
            double p = (t / 300.0) * 100;

            a = Math.round(a * 100.0) / 100.0;
            p = Math.round(p * 100.0) / 100.0;

            r[i][0] = t;
            r[i][1] = a;
            r[i][2] = p;
        }
        return r;
    }

    public static String[][] getGrade(double r[][]) {
        String g[][] = new String[r.length][1];
        int i;

        for (i = 0; i < r.length; i++) {
            if (r[i][2] >= 80)
                g[i][0] = "A";
            else if (r[i][2] >= 70)
                g[i][0] = "B";
            else if (r[i][2] >= 60)
                g[i][0] = "C";
            else if (r[i][2] >= 50)
                g[i][0] = "D";
            else if (r[i][2] >= 40)
                g[i][0] = "E";
            else
                g[i][0] = "R";
        }
        return g;
    }

    public static void show(int m[][], double r[][], String g[][]) {
        int i;

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPer\tGrade");

        for (i = 0; i < m.length; i++) {
            System.out.println(
                m[i][0] + "\t" +
                m[i][1] + "\t" +
                m[i][2] + "\t" +
                (int)r[i][0] + "\t" +
                r[i][1] + "\t" +
                r[i][2] + "\t" +
                g[i][0]
            );
        }
    }

    public static void main(String args[]) {
        int n = 5;

        int m[][] = getMarks(n);
        double r[][] = getResult(m);
        String g[][] = getGrade(r);

        show(m, r, g);
    }
}
