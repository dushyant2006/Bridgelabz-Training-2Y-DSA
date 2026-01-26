import java.util.Scanner;

public class VowelCount {
    public static int checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                return 1;
            else
                return 2;
        }
        return 0;
    }

    public static int[] countVC(String text) {
        int v = 0, c = 0;

        for (int i = 0; i < text.length(); i++) {
            int r = checkChar(text.charAt(i));
            if (r == 1) v++;
            if (r == 2) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String text;
        System.out.print("Enter text: ");
        text = sc.nextLine();

        int res[] = countVC(text);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
    }
}
