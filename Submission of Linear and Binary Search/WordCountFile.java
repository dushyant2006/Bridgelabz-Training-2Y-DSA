import java.io.*;

public class WordCountFile {
    public static void main(String args[]) throws Exception {

        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);

        String word = "java";
        int count = 0;
        String line;

        while ((line = br.readLine()) != null) {
            String a[] = line.split(" ");
            for (int i = 0; i < a.length; i++)
                if (a[i].equals(word))
                    count++;
        }

        System.out.println(count);
        br.close();
    }
}
