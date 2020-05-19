import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Name of the class has to be "Main" only if the class is public. */
class LeCandy {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(in.readLine());

        for (int t = 1; t <= tc; t++) {
            String[] inp = in.readLine().split(" ");
            int n = Integer.parseInt(inp[0]);
            int candy = Integer.parseInt(inp[1]);
            int[] An = new int[n];
            inp = in.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                An[i] = Integer.parseInt(inp[i]);
                candy -= An[i];
            }
            System.out.println(candy >= 0 ? "Yes" : "No");
        }
    }
}
