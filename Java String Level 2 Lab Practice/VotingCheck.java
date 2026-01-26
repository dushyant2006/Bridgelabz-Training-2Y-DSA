public class VotingCheck {
    public static int[] generateAges(int n) {
        int age[] = new int[n];

        for (int i = 0; i < n; i++)
            age[i] = (int)(Math.random() * 90);

        return age;
    }

    public static String[][] checkVote(int age[]) {
        String result[][] = new String[age.length][2];

        for (int i = 0; i < age.length; i++) {
            result[i][0] = String.valueOf(age[i]);
            if (age[i] >= 18)
                result[i][1] = "true";
            else
                result[i][1] = "false";
        }
        return result;
    }

    public static void main(String args[]) {
        int age[] = generateAges(10);
        String table[][] = checkVote(age);

        System.out.println("Age\tCanVote");
        for (int i = 0; i < table.length; i++)
            System.out.println(table[i][0] + "\t" + table[i][1]);
    }
}
