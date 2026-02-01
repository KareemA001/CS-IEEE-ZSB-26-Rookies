import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfApples = input.nextInt();
        int[] applesWeight = new int[numberOfApples];

        long sum = 0;
        for(int i = 0; i < numberOfApples; i++){
            applesWeight[i] = input.nextInt();
            sum += applesWeight[i];
        }

        long result = Long.MAX_VALUE;

        int totalMasks = 1 << numberOfApples;
        for (int i = 0; i < totalMasks; i++) {
            long subsetSum = 0;
            for (int j = 0; j < numberOfApples; j++){
                if ((i & (1 << j)) != 0){
                    subsetSum += applesWeight[j];
                }
            }
            long difference = Math.abs(2 * subsetSum - sum);
            result = result < difference ? result:difference;
        }
        System.out.println(result);
    }
}