import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Name of the class has to be "Main" only if the class is public. */
class CNote {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(in.readLine());

        for (int t = 1; t <= tc; t++) {
            String[] inp = in.readLine().split(" ");
            int X = Integer.parseInt(inp[0]);
            int Y = Integer.parseInt(inp[1]);
            int K = Integer.parseInt(inp[2]);
            int N = Integer.parseInt(inp[3]);
            boolean flag = false;
            int req_pg = X - Y;

            for (int i = 0; i < N; i++) {
                inp = in.readLine().trim().split(" ");
                int pages = Integer.parseInt(inp[0]);
                int price = Integer.parseInt(inp[1]);
                if (req_pg <= pages && price <= K)
                    flag = true;
            }
            // Ternary if-else
            System.out.println(flag ? "LuckyChef" : "UnluckyChef");
        }
        // closing BR object
        in.close();
    }
}