import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int totalNumbers = Integer.parseInt(st.nextToken());
        int queriesNumber = Integer.parseInt(st.nextToken());
        int[] numbers = new int[totalNumbers];
        int[] prefix = new int[totalNumbers];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < totalNumbers; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        prefix[0] = numbers[0];
        for (int i = 1; i < totalNumbers; i++) {
            prefix[i] = prefix[i - 1] ^ numbers[i];
        }
        StringBuilder output = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < queriesNumber; i++) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            sum = left == 1 ? prefix[right - 1]:prefix[right - 1] ^ prefix[left - 2];
            output.append(sum).append('\n');
        }
        System.out.print(output);
    }
}
