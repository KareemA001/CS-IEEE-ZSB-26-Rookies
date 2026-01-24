import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfShops = input.nextInt();
		int x = 0, m = 0;
		int[] shops = new int[numberOfShops];
		int start= 0, end = 0;
		for(int i = 0; i < numberOfShops; i++) {
			x = input.nextInt();
			shops[i] = x;
		}
		Arrays.sort(shops);
		int q = input.nextInt();
		int mid = 0;
		
		for(int i = 0; i < q; i++) {
			m = input.nextInt();
			end = numberOfShops-1;
			start = 0;
			while(start <= end) {
				mid = start + (end-start)/2;
				if(m >= shops[mid]) {
					start = mid +1;
				}else
					end = mid -1;
			}
			System.out.println(end+1);
		}
	}
}
