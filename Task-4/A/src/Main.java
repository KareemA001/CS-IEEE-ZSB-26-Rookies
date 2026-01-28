import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfBooks = input.nextInt();
        int numberOfMinutes = input.nextInt();

        int[] books = new int[numberOfBooks];

        for(int i = 0; i < numberOfBooks; i++){
            books[i] = input.nextInt();
        }

        int ptr1 = 0, ptr2 = 0, totalBooks = 0;
        int sum = 0;
        while(ptr2 < numberOfBooks){
            sum +=  books[ptr2++];
            while(sum > numberOfMinutes){
                sum -= books[ptr1++];
            }
            totalBooks = Math.max(totalBooks,ptr2 - ptr1);
        }
        System.out.println(totalBooks);
    }
}