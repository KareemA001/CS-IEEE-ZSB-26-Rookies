import java.util.Scanner;
public class C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = n * (n + 1) / 2;

        if (sum % 2 != 0) {
            System.out.println("NO");
            return;
        }

        long target = sum / 2;
        int x = 0, y = 0;
        boolean[] numbers = new boolean[n + 1];

        for (int i = n; i >= 1; i--) {
            if (target >= i) {
                target -= i;
                numbers[i] = true; // put in set1
                x++;
            } else {
                y++; // set2
            }
        }
        System.out.println("YES");
        System.out.println(y);
        for (int i = 1 ; i <= n; i++){
            if(!numbers[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(n-y);
        for (int i = 1 ; i <= n; i++){
            if(numbers[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
/*
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = n * (n + 1) / 2;

        if (sum % 2 != 0) {
            System.out.println("NO");
            return;
        }

        long target = sum / 2;
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();

        for (int i = n; i >= 1; i--) {
            if (i <= target) {
                target -= i;
                set1.add(i);
            } else {
                set2.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("YES\n");
        sb.append(set2.size()).append("\n");
        for (int x : set2) sb.append(x).append(" ");
        sb.append("\n").append(set1.size()).append("\n");
        for (int x : set1) sb.append(x).append(" ");
        System.out.println(sb);
    }
}
*/