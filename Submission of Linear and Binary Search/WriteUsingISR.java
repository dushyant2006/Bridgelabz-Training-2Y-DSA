import java.io.*;

public class WriteUsingISR {
    public static void main(String args[]) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        FileWriter fw = new FileWriter("output.txt");

        String line;
        while (true) {
            line = br.readLine();
            if (line.equals("exit"))
                break;
            fw.write(line + "\n");
        }

        fw.close();
    }
}
