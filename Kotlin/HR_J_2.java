import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
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

            System.out.println(" Test: " + b);

            while (i < n) {

                sum += (int) (Math.pow(2, i)) * b;
                System.out.print(sum + " ");
                i++;
            }
            System.out.println();
        }
    }

    public void inputNumbers() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger temp = new BigInteger(br.readLine());

        if (temp.compareTo(new BigInteger(String.valueOf(Long.MIN_VALUE))) == -1 ||
                temp.compareTo(new BigInteger(String.valueOf(Long.MAX_VALUE))) == 1
        ) {
            System.out.println(temp + " can't be fitted anywhere.");
        } else {
            System.out.println(temp + " can be fitted in:");
            if (temp.compareTo(new BigInteger(String.valueOf(Byte.MIN_VALUE))) == 1 &&
                    temp.compareTo(new BigInteger(String.valueOf(Byte.MAX_VALUE))) == -1
            ) {
                System.out.println("* byte");
            }
            if (temp.compareTo(new BigInteger(String.valueOf(Short.MIN_VALUE))) == 1 &&
                    temp.compareTo(new BigInteger(String.valueOf(Short.MAX_VALUE))) == -1
            ) {
                System.out.println("* short");
            }
            if (temp.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) == 1 &&
                    temp.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) == -1
            ) {
                System.out.println("* int");
            }
            System.out.println("* long");
        }

    }
}