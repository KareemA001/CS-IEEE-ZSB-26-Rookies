import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int numbers = Integer.parseInt(input[0]);
        int target = Integer.parseInt(input[1]);

        //int numbers = input.nextInt();
        //int target = input.nextInt();

        int[] arr = new int[numbers];
        String[] inputNumbers = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(inputNumbers[i]);
        }

        int left = 0, right = 0;
        long sum = 0;
        int subArrays = 0;

        while (right < numbers) {
            sum += arr[right];

            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                subArrays++;
            }
            right++;
        }

        System.out.println(subArrays);
    }
}