package vivekfirstcode;
import java.util.Scanner;

public class Count_Times_Of_occurance_of_Number {
    public static void main(String[] args) {

        Scanner inputTaker = new Scanner(System.in);
        int number = 1385757879;
        int count = 0;

        while (number > 0){

            int remainder = number % 10;
            if(remainder == 7){
                count++;
            }

            number=number/10;
        }
        System.out.println(count);
    }
}
