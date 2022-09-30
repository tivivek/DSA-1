package vivekfirstcode;

import java.util.Scanner;

public class Floyd_Triangle {
    public static void main(String[] args) {
        Scanner inputTaker = new Scanner(System.in);
        int m = inputTaker.nextInt();
        int i, j;
        int Number = 1;

        for (i = 1; i <= m; i++) {
            //inner loop
            for (j = 1; j <= i; j++) {
                System.out.print(Number+" ");
                Number++; //number=number+1
            }
            System.out.println();
        }
    }


}
