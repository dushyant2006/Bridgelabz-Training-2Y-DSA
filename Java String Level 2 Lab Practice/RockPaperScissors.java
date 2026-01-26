import java.util.Scanner;

public class RockPaperScissors {
    public static String computerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    public static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if (user.equals("rock") && comp.equals("scissors")) return 1;
        if (user.equals("paper") && comp.equals("rock")) return 1;
        if (user.equals("scissors") && comp.equals("paper")) return 1;
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int games, userWin = 0, compWin = 0;
        System.out.print("Enter number of games: ");
        games = sc.nextInt();

        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice: ");
            String user = sc.next();

            String comp = computerChoice();
            int r = winner(user, comp);

            if (r == 1) userWin++;
            if (r == -1) compWin++;
        }

        System.out.println("User Wins: " + userWin);
        System.out.println("Computer Wins: " + compWin);
        System.out.println("User %: " + (userWin * 100 / games));
        System.out.println("Computer %: " + (compWin * 100 / games));
    }
}
