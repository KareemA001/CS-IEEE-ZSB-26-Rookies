import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class F {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num+1];
        int[] indexes = new int[num+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= num; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= num; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] >= numbers[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                indexes[i] = 0;
            } else {
                indexes[i] = stack.peek();
            }
            stack.push(i);
        }

        for (int i = 1; i <= num; i++) {
            System.out.print(indexes[i]+ " ");
        }
    }
}