
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/java-datatypes">Java Datatypes</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaDatatypes {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; i++) {
            String s = in.readLine();
            try {
                long n = Long.parseLong(s);
                System.out.println(n + " can be fitted in:");
                if (n >= -128 && n <= 127) {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (n >= -32768 && n <= 32767) {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (n >= -2147483648 && n <= 2147483647) {
                    System.out.println("* int");
                    System.out.println("* long");
                } else {
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                System.out.println(s + " can't be fitted anywhere.");
            }

        }
        out.close();
    }
}
