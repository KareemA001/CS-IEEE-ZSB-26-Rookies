import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        for(int i = 0; i < testCases; i++){
            int length = input.nextInt();
            int[] numbers = new int[length];

            for(int j = 0; j < length; j++){
                numbers[j] = input.nextInt();
            }
            System.out.println(numbers[0]);
        }

    }
}