import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int start = 1, end = n, mid = 0,numberOfLines = 0;
		
		while(start <= end) {
			
			mid = start + (end - start)/ 2;
			int currentLines = 0,sum = 0;
			
			for(int i = 0; true; i++) {
				currentLines = mid /(int) Math.pow(k, i);
				if(currentLines == 0)
					break;
				sum += currentLines;
			}
			if(sum >= n) { 
				numberOfLines = mid;
				end = mid-1;	
			}else if(sum < n) 
				start = mid +1; 
		}
		System.out.println(numberOfLines);
	}
}

	

