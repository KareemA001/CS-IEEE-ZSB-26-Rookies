import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ChocolateBars = input.nextInt();
        int[] timeRequired = new int[ChocolateBars];

        for (int i = 0; i < timeRequired.length; i++) {
            timeRequired[i] = input.nextInt();
        }

        int left = 0, right = ChocolateBars - 1;
        int alice = 0, bob = 0;
        int aliceTime = 0, bobTime = 0;

        while (left <= right) {
            if (aliceTime <= bobTime) {
                aliceTime += timeRequired[left++];
                alice++;
            } else {
                bobTime += timeRequired[right--];
                bob++;
            }
        }
        System.out.println(alice + " " + bob);
    }
}