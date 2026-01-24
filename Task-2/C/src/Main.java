import java.util.Scanner;
public class Main {
    public static void C (String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfCows = input.nextInt();
        int queries = input.nextInt();
        int[] cows = new int[numberOfCows+1];
        int[] frequency = new int[4];

        for(int i = 1; i <= numberOfCows; i++) {
            cows[i] = input.nextInt();
            if(cows[i] == 1){
                frequency[1] += 1 ;
            }else if(cows[i] == 2){
                frequency[2] += 1 ;
            }else if(cows[i] == 3){
                frequency[3] += 1 ;
            }
        }
        for(int i = 0; i < queries; i++){
            int left = input.nextInt();
            int right = input.nextInt();
            System.out.println();
        }

    }
}