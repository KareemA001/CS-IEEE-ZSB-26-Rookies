import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        for(int i = 0; i < testCases; i++){

            int numberOfCandies = input.nextInt();
            int[] weights = new int[numberOfCandies];

            for(int j = 0; j < numberOfCandies; j++){
                weights[j] = input.nextInt();
            }

            int left = 0, right = numberOfCandies - 1;
            long alice = 0, bob = 0;
            int aliceCandies = 0, bobCandies = 0;
            int maxCandies = 0;

            while(left <= right){

                if(alice < bob){
                    alice += weights[left++];
                    aliceCandies++;
                }else if(bob < alice){
                    bob += weights[right--];
                    bobCandies++;
                }else {
                    maxCandies = aliceCandies + bobCandies;
                    alice += weights[left++];
                    aliceCandies++;
                }
            }
            if(alice == bob){
                maxCandies = aliceCandies + bobCandies;
            }
            System.out.println(maxCandies);
        }
    }
}