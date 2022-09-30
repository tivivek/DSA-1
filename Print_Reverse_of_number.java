package vivekfirstcode;
import java.util.Scanner;

public class Print_Reverse_of_number {
    public static void main(String[] args) {
        Scanner inputTaker = new Scanner(System.in);

        int number = inputTaker.nextInt();
        int reverseOfNumber = 0;

        while(number > 0){

           int remainder = number % 10;

           number /= 10;

           reverseOfNumber = reverseOfNumber * 10 + remainder;
        }
        System.out.println(reverseOfNumber);
    }
}
