package IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SimpleIO {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param function : A function to convert from String to the desired type T
     * @param <T>      : reads Type T from STDIN
     */
    public static <T extends Number> T read(Function<String, T> function) throws IOException {
        return function.apply(in.readLine());
    }

    /**
     * @param function<T> : A function to convert from String to the desired type T
     * @param <T>         : ArrayList<T> is returned after parsing a line from the STDIN
     */
    public static <T> ArrayList<T> readLine(Function<String, T> function) throws IOException {
        return Arrays.stream(in.readLine().split("\\s")).map(function).collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     *
     * @param arr : ArrayList whose contents are to be printed
     * @param <T> : Type of ArrayList
     */
    public static <T> void printList(ArrayList<T> arr) {
        arr.forEach(it -> System.out.print(it + " "));
        System.out.println();
    }

    /**
     *
     * @param arr : ArrayList whose contents are to be printed
     * @param separator : separator to be added while printing
     * @param <T> : Type of ArrayList
     */

    public static <T> void printList(ArrayList<T> arr, String separator) {
        int size = arr.size();
        for (int i = 0; i < size - 2; i++) {
            System.out.print(arr.get(i) + separator);
        }
        System.out.println(arr.get(size - 1));
    }
}
