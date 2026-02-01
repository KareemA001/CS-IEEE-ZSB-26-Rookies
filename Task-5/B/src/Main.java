import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int len = input.nextInt();

        int mod = 1000000007;
        int result = 1;

        for (int i = 0; i < len; i++) {
            result = (result * 2) % mod;
        }
        System.out.println(result);
    }
}
