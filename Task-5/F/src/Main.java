import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numbers = Integer.parseInt(br.readLine());
        int[] a = new int[numbers];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numbers; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int totalXOR = 0;
        for (int i = 0; i < numbers; i++) {
            totalXOR ^= a[i];
        }
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < numbers; i++) {
            output.append(totalXOR ^ a[i]);
            if (i + 1 < numbers) output.append(" ");
        }
        System.out.println(output.toString());
    }
}
