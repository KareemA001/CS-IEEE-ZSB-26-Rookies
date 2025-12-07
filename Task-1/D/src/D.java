import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class D {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfElements = Integer.parseInt(br.readLine());
        int[] numbers = new int[numberOfElements];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int distinctNumbers = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numberOfElements; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
            if (!set.contains(numbers[i])){
                set.add(numbers[i]);
                distinctNumbers++;
            }
        }
        System.out.println(distinctNumbers);
    }
}