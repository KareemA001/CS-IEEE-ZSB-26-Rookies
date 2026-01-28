import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main{

    public static void main(String[] arg) throws IOException {

        //Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int length = Integer.parseInt(input[0]);
        int target = Integer.parseInt(input[1]);
        /*
        int length = input.nextInt();
        int target = input.nextInt();
        */
        int[] numbers = new int[length];
        String[] inputNumbers = br.readLine().split(" ");
        for(int i = 0; i < length; i++){
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        HashMap<Integer,Integer> map = new HashMap<>() ;
        boolean isFound = false;
        for(int i = 0 ; i < numbers.length ; i++) {
            int current = target - numbers[i];
            if (map.containsKey(current)) {
                System.out.println((map.get(current)+1) + " " +(i+1));
                isFound = true;
                break;
            }
            map.put(numbers[i], i);
        }
        if(!isFound)
            System.out.println("IMPOSSIBLE");
    }
}