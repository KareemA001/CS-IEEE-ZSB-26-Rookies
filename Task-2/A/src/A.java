import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberOfValues = Integer.parseInt(st.nextToken());
        int numberOfQueries = Integer.parseInt(st.nextToken());
        long[] prefixSum = new long[numberOfValues+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= numberOfValues; i++){
            prefixSum[i] = prefixSum[i - 1] + Long.parseLong(st.nextToken()); ;
        }
        StringBuilder out = new StringBuilder();
        for(int i = 0; i < numberOfQueries; i++){
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            out.append(prefixSum[right] - prefixSum[left-1]).append('\n');
        }
        System.out.println(out.toString());
    }
}