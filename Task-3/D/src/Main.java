import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Scanner input = new Scanner(System.in);
		
		int n = Integer.parseInt(st.nextToken());
		long t = Long.parseLong(st.nextToken()); 
		/*
		int n = input.nextInt();
		long t = input.nextInt();
		*/
		long[] times = new long[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			times[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(times);
		
		long start = 0, end = times[0] * t,mid = 0;
		
		while (start <= end) {
			mid = start + (end - start) / 2;
			long totalProducts = 0;
			for (int i = 0; i < n; i++) {
				totalProducts += mid / times[i];
				if (totalProducts >= t) {
					break;
				}
			}
			if (totalProducts >= t) {
				end = mid - 1; 
			}else {
				start = mid + 1;
			}
		}
		/*
		while(start <= end) {
			mid = start + (end - start)/ 2;
			int currentProducts = 0;
			int remainingProducts = 0;
			int totalProducts = 0;
			boolean isPossiable = false;
			for(int i = 0; i < n; i++) {
				currentProducts = mid/times[i];
				remainingProducts = t - totalProducts;
				if(currentProducts >= remainingProducts) {
					isPossiable = true;
					break;			
				}
				totalProducts += currentProducts;
			}
			if(isPossiable) {
				end = mid-1;
			}else {
				start = mid +1;
			}
		}*/
		System.out.println(start);
	}
}
