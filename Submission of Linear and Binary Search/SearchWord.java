import java.util.Scanner;

public class SearchWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String s[] = new String[n];
        for (int i = 0; i < n; i++)
            s[i] = sc.nextLine();

        String word = sc.nextLine();
        String res = "Not Found";

        for (int i = 0; i < n; i++) {
            if (s[i].contains(word)) {
                res = s[i];
                break;
            }
        }

        System.out.println(res);
    }
}
