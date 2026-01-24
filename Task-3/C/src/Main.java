import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ");
		Scanner input = new Scanner(System.in);
		/*
		int N = input.nextInt();
		int M = input.nextInt(); 
		int K = input.nextInt();
		*/
		int N = Integer.parseInt(first[0]);
		int M = Integer.parseInt(first[1]);
		int K = Integer.parseInt(first[2]);
		int[] heads = new int[N];
		int[] bodies = new int[M];
		
		
		int index = 0;
		while(index < N) {
			String[] parts = br.readLine().split(" ");
			for(String s : parts) {
				if(s.isEmpty())
					continue;
				heads[index++] = Integer.parseInt(s);
				if(index >= N)
					break;
			}
		}
		
		index = 0;
		while(index < M) {
			String[] parts = br.readLine().split(" ");
			for(String s : parts) {
				if(s.isEmpty())
					continue;
				bodies[index++] = Integer.parseInt(s);
				if(index >= M)
					break;
			}
		}
		
		/*
		for(int i = 0; i < N; i++) {
			heads[i] = input.nextInt();
		}
		for(int i = 0; i < M; i++) {
			bodies[i] = input.nextInt();
		}
		*/
		
		Arrays.sort(heads);
		Arrays.sort(bodies);
		int ptr1 =0, ptr2 = 0;
		while(ptr1 < N && ptr2 < M) {
			if(heads[ptr1] <= bodies[ptr2]) {
				ptr1++;
				ptr2++;
				K--;
			}else {
				ptr2++;
			}
		}
		if(K <= 0)
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}
