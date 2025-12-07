import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String seq = input.nextLine();
        int length = seq.length();
        int maxRepetition = 0;
        int leftPointer = 0, rightPointer = 1;
        while(rightPointer < length) {
            if(seq.charAt(rightPointer) == seq.charAt(leftPointer)) {
                rightPointer++;
            }else{
                maxRepetition = rightPointer - leftPointer > maxRepetition ? rightPointer - leftPointer : maxRepetition;
                leftPointer = rightPointer;
                rightPointer++;
            }

        }
        if((rightPointer-leftPointer) > maxRepetition) {
            maxRepetition = rightPointer-leftPointer;
        }
        System.out.println(maxRepetition);
    }
}