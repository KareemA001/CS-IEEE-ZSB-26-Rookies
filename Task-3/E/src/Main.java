import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numberOfCities = input.nextInt();
		int numberOfTowers = input.nextInt();
		
		int[] cities = new int[numberOfCities];
		int[] towers = new int[numberOfTowers];
		
		for(int i = 0; i < numberOfCities; i++) {
			cities[i] = input.nextInt();
		}
		
		for(int i = 0; i < numberOfTowers; i++) {
			towers[i] = input.nextInt();
		}
		
		int maxDistance = 0;
        int ptr1 = 0;
        for (int i = 0; i < numberOfCities; i++) {
        	
        	while (ptr1 < numberOfTowers && towers[ptr1] < cities[i]) {
                ptr1++;
            }
            int dist = Integer.MAX_VALUE;
            if (ptr1 > 0) {
                dist = Math.min(dist, cities[i] - towers[ptr1 - 1]);
            }
            if (ptr1 < numberOfTowers) {
                dist = Math.min(dist, towers[ptr1] - cities[i]);
            }
            maxDistance = (int) Math.max(maxDistance, dist);
        }
        System.out.println(maxDistance);
	}
}
