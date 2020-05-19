import java.io.*;
import java.util.*;

public class Mobys {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(in.readLine());
        int i = 0;
        String[] temp;
        SortedMap sm = new TreeMap<Integer, Float>();
        while (i++ < n) {
            temp = in.readLine().split(" ");
            int w = Integer.parseInt(temp[0]);
            float v = Float.parseFloat(temp[1]);
            sm.put(w, (float) v / w);
        }

        sm.forEach((key, value) -> {
                System.out.println(key+ "->" + value);
                }
        );
    }
}
