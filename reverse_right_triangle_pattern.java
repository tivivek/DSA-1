package vivekfirstcode;

import java.util.Scanner;

public class reverse_right_triangle_pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {

            //inner loop for space
            for (int j = 1; j <= input - i; j++) {
                System.out.print(" ");
            }

            //inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
