package vivekfirstcode;

import java.util.Scanner;

public class right_triangle_pattern_of_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {

            //inner loop for space
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
