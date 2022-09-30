package vivekfirstcode;

import java.util.Scanner;

public class Triangle_pattern_hardlevel {
    public static void main(String[] args) {
        Scanner inputTaker = new Scanner(System.in);
        int m = inputTaker.nextInt();
        int i, j;

        for (i = 1; i <= m; i++)
        {
            for (j = 1; j <= i; j++)
            {
                int sum = i + j;
                if (sum % 2 == 0)
                {
                    //even
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }



    }
}
