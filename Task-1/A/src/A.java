import java.util.Scanner;
public class A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int initialWeight = input.nextInt();
        int partsNumber = input.nextInt();

        int[] weights = new int[partsNumber + 1];
        boolean[] isSelected = new boolean[partsNumber + 1];

        for (int i = 1; i <= partsNumber; i++) {
            weights[i] = input.nextInt();
        }

        int queriesNumber = input.nextInt();

        for (int i = 1; i <= queriesNumber; i++) {
            int currentQuery = input.nextInt();
            if (isSelected[currentQuery] == false) {
                isSelected[currentQuery] = true;
                initialWeight += weights[currentQuery];
            } else {
                initialWeight -= weights[currentQuery];
                isSelected[currentQuery] = false;
            }
            System.out.println(initialWeight);
        }
    }
}