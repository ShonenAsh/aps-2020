import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class HR_J_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, sum;
        int Q = Integer.parseInt(br.readLine());
        for (int q = 1; q <= Q; q++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            i = 0;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            sum = a;

            System.out.println(" Test: "+ b);

            while (i < n) {

                sum += (int) (Math.pow(2, i)) * b;
                System.out.print(sum + " ");
                i++;
            }
            System.out.println();
        }
    }
}